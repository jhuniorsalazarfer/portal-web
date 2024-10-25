package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.*;
import pe.gob.senamhi.mapper.DataVariableMapperService;
import pe.gob.senamhi.repository.DataVariableRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataVariableService extends DataVariableMapperService {

    @Autowired
    private DataVariableRepository repository;
    @Autowired
    private EstacionService estacionService;
    @Autowired
    private ArchivoService archivoService;

    public DataEstacionDto findByCodEstacionDetail(String codEsta) {

        DataEstacionDto dataEstacionDto = new DataEstacionDto();
        EstacionReponseDto estacionReponseDto = new EstacionReponseDto();
        ArchivoDto archivoDto = new ArchivoDto();

        //Obtener Datos
        estacionReponseDto = estacionService.findByIdDetail(codEsta);
        archivoDto = archivoService.findByCodigoEstacion(codEsta);

        // Usar Calendar para restar horas
        int horas = 12;
        Date fechaActual = new Date();
        Calendar fechaHace12horas = Calendar.getInstance();
        fechaHace12horas.setTime(fechaActual);
        fechaHace12horas.add(Calendar.HOUR_OF_DAY, -horas);

        Date fechaParametro = fechaHace12horas.getTime();

        List<DataVariableDto> dataVariableDtos = repository.ListByFechaAndCodEstacion(fechaParametro, codEsta)
        		.stream().map(this::convertToDto)
                .collect(Collectors.toList());

//        Altura de Nivel de agua promedio horario	76
//        Altura de Nivel de agua instantaneo horaria en Radar	168
//        Altura de Nivel de agua promedio horario	82
//        Altura de Nivel de Agua instantáneo horario	 73
//        Intensidad de Lluvia horaria	31
//        Precipitacion acumulada a los10minutos	 107

        ArrayList<Integer> arrayVariable = new ArrayList<Integer>();

        List<DataVariableDto> dataVariableDto76 = dataVariableDtos.stream().filter(p->p.getCodVariable()==76).collect(Collectors.toList());
        List<DataVariableDto> dataVariableDto168 = dataVariableDtos.stream().filter(p->p.getCodVariable()==168).collect(Collectors.toList());
        List<DataVariableDto> dataVariableDto82 = dataVariableDtos.stream().filter(p->p.getCodVariable()==82).collect(Collectors.toList());;
        List<DataVariableDto> dataVariableDto73 = dataVariableDtos.stream().filter(p->p.getCodVariable()==73).collect(Collectors.toList());
        List<DataVariableDto> dataVariableDto31 = dataVariableDtos.stream().filter(p->p.getCodVariable()==31).collect(Collectors.toList());
        List<DataVariableDto> dataVariableDto107 = dataVariableDtos.stream().filter(p->p.getCodVariable()==107).collect(Collectors.toList());

        if (!dataVariableDto76.isEmpty()){
            arrayVariable.add(76);
        }
        if (!dataVariableDto168.isEmpty()){
            arrayVariable.add(168);
        }
        if (!dataVariableDto82.isEmpty()){
            arrayVariable.add(82);
        }
        if (!dataVariableDto73.isEmpty()){
            arrayVariable.add(73);
        }
        if (!dataVariableDto31.isEmpty()){
            arrayVariable.add(31);
        }
        if (!dataVariableDto107.isEmpty()){
            arrayVariable.add(107);
        }

        List<DataVariableResponseDto> dataVariableResponseList =  new ArrayList<>();
        for (int a : arrayVariable) {
            if (a == 73){
                for (DataVariableDto d : dataVariableDto73) {
                    DataVariableResponseDto dataVariableResponseDto = new DataVariableResponseDto();
                    dataVariableResponseDto.setNivelReg10min(d.getValor().toString());

                    List<DataVariableDto> dataVariable76 = dataVariableDto76.stream()
                            .filter(p->p.getFechaRegistro()== d.getFechaRegistro()).collect(Collectors.toList());

                    if (!dataVariable76.isEmpty())
                    {
                        dataVariableResponseDto.setNivelHorario(dataVariable76.get(0).getValor().toString());
                    }
                    else {
                        dataVariableResponseDto.setNivelHorario(null);
                    }
                    dataVariableResponseList.add(dataVariableResponseDto);

                }
            }
        }


        dataEstacionDto.setEstacionReponse(estacionReponseDto);
        dataEstacionDto.setArchivo(archivoDto);
        dataEstacionDto.setDataHidrometricaHorario(dataVariableDtos);
        dataEstacionDto.setDataVariableResponse(dataVariableResponseList);

        return dataEstacionDto;
    }
}

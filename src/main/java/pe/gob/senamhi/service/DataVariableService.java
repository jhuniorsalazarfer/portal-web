package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.*;
import pe.gob.senamhi.mapper.DataVariableMapperService;
import pe.gob.senamhi.repository.DataVariableRepository;

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

        dataEstacionDto.setEstacionReponse(estacionReponseDto);
        dataEstacionDto.setArchivo(archivoDto);
        dataEstacionDto.setDataHidrometricaHorario(dataVariableDtos);

        return dataEstacionDto;
    }
}

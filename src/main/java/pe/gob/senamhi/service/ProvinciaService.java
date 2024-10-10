package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.DepartamentoDto;
import pe.gob.senamhi.dto.EstacionDto;
import pe.gob.senamhi.dto.ProvinciaDto;
import pe.gob.senamhi.mapper.ProvinciaMapperService;
import pe.gob.senamhi.repository.ProvinciaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProvinciaService extends ProvinciaMapperService {
    @Autowired
    private ProvinciaRepository repository;

    @Autowired
    private EstacionService estacionService;

    public List<ProvinciaDto> getAll() {

        List<ProvinciaDto> dto = repository.findAll()
                .stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public  List<ProvinciaDto> getAllConvenio (String codDep){
        List<EstacionDto> estacionDtos = estacionService.getAllConvenioProv(codDep);
        List<ProvinciaDto> provinciaConvenioListDto = new ArrayList<>();

        if (!estacionDtos.isEmpty()){
            List<String> codigosList = estacionDtos.stream()
                    .map(EstacionDto::getCodProvincia)
                    .collect(Collectors.toList());

            List<String> codigosProvincia = new ArrayList<>();

            codigosProvincia = codigosList.stream().distinct().collect(Collectors.toList());

            for (String codig: codigosProvincia) {
                ProvinciaDto provinciaConvenioDto = new ProvinciaDto();
                provinciaConvenioDto = repository.finByCodProvAndCodDep(codig,codDep).map(this::convertToDto).orElse(null);
                provinciaConvenioListDto.add(provinciaConvenioDto);
            }
        }

        return provinciaConvenioListDto;
    }

    public ProvinciaDto finByCodProvAndCodDep(String codProv, String codDep) {
        return repository.finByCodProvAndCodDep(codProv,codDep).map(this::convertToDto).orElse(null);
    }
}

package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.DistritoDto;
import pe.gob.senamhi.dto.EstacionDto;
import pe.gob.senamhi.dto.ProvinciaDto;
import pe.gob.senamhi.mapper.DistritoMapperService;
import pe.gob.senamhi.repository.DistritoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class DistritoService extends DistritoMapperService {

    @Autowired
    private DistritoRepository repository;

    @Autowired
    private EstacionService estacionService;

    public List<DistritoDto> getAll() {

        List<DistritoDto> dto = repository.findAll()
                .stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public  List<DistritoDto> getAllConvenio (String codProv, String codDep){
        List<EstacionDto> estacionDtos = estacionService.getAllConvenioDist(codProv, codDep);
        List<DistritoDto> distritoConvenioListDto = new ArrayList<>();

        if (!estacionDtos.isEmpty()){
            List<String> codigosList = estacionDtos.stream()
                    .map(EstacionDto::getCodDistrito)
                    .collect(Collectors.toList());

            List<String> codigosDistrito = new ArrayList<>();

            codigosDistrito = codigosList.stream().distinct().collect(Collectors.toList());

            for (String codig: codigosDistrito) {
                DistritoDto distritoConvenioDto = new DistritoDto();
                distritoConvenioDto = repository.finByConDistAndCodProvAndCodDep(codig,codProv,codDep).map(this::convertToDto).orElse(null);
                distritoConvenioListDto.add(distritoConvenioDto);
            }
        }

        return distritoConvenioListDto;
    }

    public DistritoDto finByConDistAndCodProvAndCodDep(String codDist,String codProv, String codDep) {
        return repository.finByConDistAndCodProvAndCodDep(codDist,codProv,codDep).map(this::convertToDto).orElse(null);
    }
}

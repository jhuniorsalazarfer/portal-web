package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.DepartamentoDto;
import pe.gob.senamhi.dto.EstacionDto;
import pe.gob.senamhi.mapper.DepartamentoMapperService;
import pe.gob.senamhi.repository.DepartamentoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

@Service
public class DepartamentoService extends DepartamentoMapperService {
    @Autowired
    private DepartamentoRepository repository;

    @Autowired
    private EstacionService estacionService;

    public List<DepartamentoDto> getAll() {

        List<DepartamentoDto> dto = repository.findAll()
                .stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

	public List<DepartamentoDto> getAllConvenio() {

        List<EstacionDto> estacionDtos = estacionService.getAllConvenio();
        List<DepartamentoDto> departamentoConvenioListDto = new ArrayList<>();

        if (!estacionDtos.isEmpty()){
            List<String> codigosList = estacionDtos.stream()
                    .map(EstacionDto::getCodDepartamento)
                    .collect(Collectors.toList());
            
            List<String> codigosDepa = new ArrayList<>();

            codigosDepa = codigosList.stream().distinct().collect(Collectors.toList());

            for (String codig: codigosDepa) {
                DepartamentoDto departamentoConvenioDto = new DepartamentoDto();
                departamentoConvenioDto = repository.findById(codig).map(this::convertToDto).orElse(null);
                departamentoConvenioListDto.add(departamentoConvenioDto);
            }
        }

        return departamentoConvenioListDto;
    }

    public DepartamentoDto findById(String codDep) {
        return repository.findById(codDep).map(this::convertToDto).orElse(null);
    }
}

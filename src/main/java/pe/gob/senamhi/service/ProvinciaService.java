package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.dto.DepartamentoDto;
import pe.gob.senamhi.dto.ProvinciaDto;
import pe.gob.senamhi.mapper.ProvinciaMapperService;
import pe.gob.senamhi.repository.DepartamentoRepository;
import pe.gob.senamhi.repository.ProvinciaRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProvinciaService extends ProvinciaMapperService {
    @Autowired
    private ProvinciaRepository repository;

    public List<ProvinciaDto> getAll() {

        List<ProvinciaDto> dto = repository.findAll()
                .stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }
}

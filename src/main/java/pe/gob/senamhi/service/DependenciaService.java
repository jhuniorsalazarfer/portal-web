package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.senamhi.dto.DependenciaDto;
import pe.gob.senamhi.mapper.DependenciaMapperService;
import pe.gob.senamhi.repository.DependenciaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DependenciaService extends DependenciaMapperService {
    @Autowired
    private DependenciaRepository repository;
    public List<DependenciaDto> getAll() {

        List<DependenciaDto> dto = repository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

}

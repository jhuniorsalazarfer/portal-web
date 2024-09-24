package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.DepartamentoDto;
import pe.gob.senamhi.mapper.DepartamentoMapperService;
import pe.gob.senamhi.repository.DepartamentoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartamentoService extends DepartamentoMapperService {
    @Autowired
    private DepartamentoRepository repository;

    public List<DepartamentoDto> listar() {

        List<DepartamentoDto> dto = repository.findAll().stream().map(this::convertToDto)
                .collect(Collectors.toList());

        return dto;
    }

}

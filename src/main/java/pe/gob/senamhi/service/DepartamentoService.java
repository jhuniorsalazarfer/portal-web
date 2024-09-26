package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.DepartamentoDto;
import pe.gob.senamhi.mapper.DepartamentoMapperService;
import pe.gob.senamhi.repository.DepartamentoRepository;

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

        List<DepartamentoDto> dto = repository.findAll()
                .stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public DepartamentoDto findById(String codDep) {
        return repository.findById(codDep).map(this::convertToDto).orElse(null);
    }
}

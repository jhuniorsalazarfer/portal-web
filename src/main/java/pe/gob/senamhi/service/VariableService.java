package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.VariableDto;
import pe.gob.senamhi.mapper.VariableMapperService;
import pe.gob.senamhi.repository.VariableRepository;

@Service
public class VariableService extends VariableMapperService {
    @Autowired
    private VariableRepository repository;

    public VariableDto findById(Integer codVariable) {
        return repository.findById(codVariable).map(this::convertToDto).orElse(null);
    }
}

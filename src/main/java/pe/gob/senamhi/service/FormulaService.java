package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.FormulaDto;
import pe.gob.senamhi.mapper.FormulaMapperService;
import pe.gob.senamhi.model.Formula;
import pe.gob.senamhi.repository.FormulaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FormulaService extends FormulaMapperService {

    @Autowired
    private FormulaRepository repository;

    public List<FormulaDto> getAll() {

        List<FormulaDto> dto = repository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public Optional<FormulaDto> save(FormulaDto request) {
        Formula formula = this.convertToEntity(request);

        Formula formula1 = repository.save(formula);
        return Optional.ofNullable(this.convertToDto(formula1));
    }

}

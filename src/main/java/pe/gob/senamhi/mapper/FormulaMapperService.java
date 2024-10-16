package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.FormulaDto;
import pe.gob.senamhi.model.Formula;

public class FormulaMapperService implements MapperService<Formula, FormulaDto> {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public FormulaDto convertToDto(Formula request) {
        FormulaDto dto = modelMapper.map(request, FormulaDto.class);
        return dto;
    }

    @Override
    public Formula convertToEntity(FormulaDto request) {
        Formula entity = modelMapper.map(request, Formula.class);
        return entity;
    }
}

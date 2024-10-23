package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.VariableDto;
import pe.gob.senamhi.model.Variable;

public class VariableMapperService implements MapperService<Variable, VariableDto> {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public VariableDto convertToDto(Variable request) {
        VariableDto dto = modelMapper.map(request, VariableDto.class);
        return dto;
    }

    @Override
    public Variable convertToEntity(VariableDto request) {
        Variable entity = modelMapper.map(request, Variable.class);
        return entity;
    }
}

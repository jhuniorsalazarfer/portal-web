package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.DataVariableDto;
import pe.gob.senamhi.model.DataVariable;

public class DataVariableMapperService implements MapperService<DataVariable, DataVariableDto> {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DataVariableDto convertToDto(DataVariable request) {
        DataVariableDto dto = modelMapper.map(request, DataVariableDto.class);
        return dto;
    }

    @Override
    public DataVariable convertToEntity(DataVariableDto request) {
        DataVariable entity = modelMapper.map(request, DataVariable.class);
        return entity;
    }
}

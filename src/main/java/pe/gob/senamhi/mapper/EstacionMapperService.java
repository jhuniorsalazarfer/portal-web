package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.EstacionDto;
import pe.gob.senamhi.model.Estacion;

public class EstacionMapperService implements MapperService<Estacion, EstacionDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EstacionDto convertToDto(Estacion request) {
        EstacionDto dto = modelMapper.map(request, EstacionDto.class);
        return dto;
    }

    @Override
    public Estacion convertToEntity(EstacionDto request) {
        Estacion entity = modelMapper.map(request, Estacion.class);
        return entity;
    }
}

package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.PrecipitacionDto;
import pe.gob.senamhi.model.Precipitacion;

public class PrecipitacionMapperService implements MapperService<Precipitacion, PrecipitacionDto> {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PrecipitacionDto convertToDto(Precipitacion request) {
        PrecipitacionDto dto = modelMapper.map(request, PrecipitacionDto.class);
        return dto;
    }

    @Override
    public Precipitacion convertToEntity(PrecipitacionDto request) {
        Precipitacion entity = modelMapper.map(request, Precipitacion.class);
        return entity;
    }
}

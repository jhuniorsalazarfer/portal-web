package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.TipoEstacionDto;
import pe.gob.senamhi.model.TipoEstacion;

public class TipoEstacionMapperService implements MapperService<TipoEstacion, TipoEstacionDto> {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TipoEstacionDto convertToDto(TipoEstacion request) {
        TipoEstacionDto dto = modelMapper.map(request, TipoEstacionDto.class);
        return dto;
    }

    @Override
    public TipoEstacion convertToEntity(TipoEstacionDto request) {
        TipoEstacion entity = modelMapper.map(request, TipoEstacion.class);
        return entity;
    }
}

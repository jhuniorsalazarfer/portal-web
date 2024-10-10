package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.CategoriaEstacionDto;
import pe.gob.senamhi.model.CategoriaEstacion;

public class CategoriaEstacionMapperService implements MapperService<CategoriaEstacion, CategoriaEstacionDto> {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoriaEstacionDto convertToDto(CategoriaEstacion request) {
        CategoriaEstacionDto dto = modelMapper.map(request, CategoriaEstacionDto.class);
        return dto;
    }

    @Override
    public CategoriaEstacion convertToEntity(CategoriaEstacionDto request) {
        CategoriaEstacion entity = modelMapper.map(request, CategoriaEstacion.class);
        return entity;
    }
}

package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.DependenciaDto;
import pe.gob.senamhi.model.Dependencia;

@Component
public class DependenciaMapperService implements MapperService<Dependencia, DependenciaDto> {
    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public DependenciaDto convertToDto(Dependencia request) {
        DependenciaDto dto = modelMapper.map(request, DependenciaDto.class);
        return dto;
    }

    @Override
    public Dependencia convertToEntity(DependenciaDto request) {
        Dependencia entity = modelMapper.map(request, Dependencia.class);
        return entity;
    }
}

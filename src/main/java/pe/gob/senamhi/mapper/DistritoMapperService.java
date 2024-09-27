package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.DistritoDto;
import pe.gob.senamhi.model.Distrito;

public class DistritoMapperService implements MapperService<Distrito, DistritoDto> {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DistritoDto convertToDto(Distrito request) {
        DistritoDto dto = modelMapper.map(request, DistritoDto.class);
        return dto;
    }

    @Override
    public Distrito convertToEntity(DistritoDto request) {
        Distrito entity = modelMapper.map(request, Distrito.class);
        return entity;
    }
}

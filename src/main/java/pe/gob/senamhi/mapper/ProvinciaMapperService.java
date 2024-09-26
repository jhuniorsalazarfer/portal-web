package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.ProvinciaDto;
import pe.gob.senamhi.model.Provincia;

public class ProvinciaMapperService implements MapperService<Provincia, ProvinciaDto> {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProvinciaDto convertToDto(Provincia request) {
        ProvinciaDto dto = modelMapper.map(request, ProvinciaDto.class);
        return dto;
    }

    @Override
    public Provincia convertToEntity(ProvinciaDto request) {
        Provincia entity = modelMapper.map(request, Provincia.class);
        return entity;
    }
}

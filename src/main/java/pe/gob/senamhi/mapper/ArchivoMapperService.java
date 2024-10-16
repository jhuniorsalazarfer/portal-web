package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.ArchivoDto;
import pe.gob.senamhi.model.Archivo;

public class ArchivoMapperService implements MapperService<Archivo, ArchivoDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ArchivoDto convertToDto(Archivo request) {
        ArchivoDto dto = modelMapper.map(request, ArchivoDto.class);
        return dto;
    }

    @Override
    public Archivo convertToEntity(ArchivoDto request) {
        Archivo entity = modelMapper.map(request, Archivo.class);
        return entity;
    }
}

package pe.gob.senamhi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pe.gob.senamhi.config.MapperService;
import pe.gob.senamhi.dto.DepartamentoDto;
import pe.gob.senamhi.model.Departamento;

public class DepartamentoMapperService implements MapperService<Departamento, DepartamentoDto> {

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public DepartamentoDto convertToDto(Departamento request) {
        DepartamentoDto dto = modelMapper.map(request, DepartamentoDto.class);
        return dto;
    }

    @Override
    public Departamento convertToEntity(DepartamentoDto request) {
        Departamento entity = modelMapper.map(request, Departamento.class);
        return entity;
    }
}

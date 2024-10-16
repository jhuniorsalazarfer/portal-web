package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.PrecipitacionDto;
import pe.gob.senamhi.mapper.PrecipitacionMapperService;
import pe.gob.senamhi.model.Precipitacion;
import pe.gob.senamhi.repository.PrecipitacionRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PrecipitacionService extends PrecipitacionMapperService {

    @Autowired
    private PrecipitacionRepository repository;

    public List<PrecipitacionDto> getAll() {

        List<PrecipitacionDto> dto = repository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public Optional<PrecipitacionDto> save(PrecipitacionDto request) {
        Precipitacion precipitacion = this.convertToEntity(request);

        if(repository.existsByValor(precipitacion.getValor()) > 0) {
            return Optional.of(new PrecipitacionDto());
        }

        Precipitacion precipitacion1 = repository.save(precipitacion);
        return Optional.ofNullable(this.convertToDto(precipitacion1));
    }
}

package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.EstacionDto;
import pe.gob.senamhi.mapper.EstacionMapperService;
import pe.gob.senamhi.repository.EstacionRepository;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class EstacionService extends EstacionMapperService {

    @Autowired
    private EstacionRepository repository;

    public List<EstacionDto> getAll() {

        List<EstacionDto> dto = repository.findAll().stream().map(this::convertToDto)
                .collect(Collectors.toList());

        return dto;
    }

    public List<EstacionDto> getAllConvenio() {
        String cod = "2208";
        List<EstacionDto> dto = repository.finByCodConvenio(cod).stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }


}

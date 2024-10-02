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

    public List<EstacionDto> getAllConvenio() {
        String cod = "230020";
        List<EstacionDto> dto = repository.finByCodConvenio(cod).stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public List<EstacionDto> getAllConvenioProv(String codDep) {
        String codConvenio = "2208";
        List<EstacionDto> dto = repository.finByCodConvenioAndCodDep(codConvenio,codDep).stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public List<EstacionDto> getAllConvenioDist(String codProv, String codDep) {
        String codConvenio = "2208";
        List<EstacionDto> dto = repository.finByCodConvenioAndCodDepAndCodProv(codConvenio,codProv,codDep).stream().map(this::convertToDto)
                .collect(Collectors.toList());
        return dto;
    }

    public EstacionDto findById(String codEsta) {
        return repository.findById(codEsta).map(this::convertToDto).orElse(null);
    }

}

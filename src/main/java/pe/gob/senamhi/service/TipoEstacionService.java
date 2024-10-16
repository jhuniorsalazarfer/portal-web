package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.TipoEstacionDto;
import pe.gob.senamhi.mapper.TipoEstacionMapperService;
import pe.gob.senamhi.repository.TipoEstacionRepository;

@Service
public class TipoEstacionService extends TipoEstacionMapperService {
    @Autowired
    private TipoEstacionRepository repository;

    public TipoEstacionDto findById(String codTipo) {
        return repository.findById(codTipo).map(this::convertToDto).orElse(null);
    }
}

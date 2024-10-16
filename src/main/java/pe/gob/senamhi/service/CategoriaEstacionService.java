package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.CategoriaEstacionDto;
import pe.gob.senamhi.mapper.CategoriaEstacionMapperService;
import pe.gob.senamhi.repository.CategoriaEstacionRepository;

@Service
public class CategoriaEstacionService extends CategoriaEstacionMapperService {

    @Autowired
    private CategoriaEstacionRepository repository;

    public CategoriaEstacionDto findById(String codCategoria) {
        return repository.findById(codCategoria).map(this::convertToDto).orElse(null);
    }
}

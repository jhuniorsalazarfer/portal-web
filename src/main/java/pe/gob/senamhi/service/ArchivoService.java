package pe.gob.senamhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.senamhi.dto.ArchivoDto;
import pe.gob.senamhi.mapper.ArchivoMapperService;
import pe.gob.senamhi.model.Archivo;
import pe.gob.senamhi.repository.ArchivoRepository;

import java.util.Optional;
@Service
public class ArchivoService extends ArchivoMapperService {

    @Autowired
    private ArchivoRepository repository;

    public Optional<ArchivoDto> save(ArchivoDto request) {
        Archivo archivo = this.convertToEntity(request);

        Archivo archivo1 = repository.save(archivo);
        return Optional.ofNullable(this.convertToDto(archivo1));
    }
}

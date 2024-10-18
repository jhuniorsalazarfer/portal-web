package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pe.gob.senamhi.dto.ArchivoDto;
import pe.gob.senamhi.dto.EstacionReponseDto;
import pe.gob.senamhi.service.ArchivoService;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(path = "archivos")
@RequiredArgsConstructor
@Service
public class ArchivoController {

    @Autowired
    private ArchivoService services;

    @PostMapping(path = "/save")
    public ResponseEntity<?> save(@Valid @RequestBody ArchivoDto request, BindingResult result) {
        Optional<ArchivoDto> archivoDto = services.save(request);

        if(archivoDto.get().getId() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<?> getByCod(@PathVariable String codEsta) throws Exception {
        ArchivoDto archivoDto = services.findByCodigoEstacion(codEsta);
        return new ResponseEntity(archivoDto, HttpStatus.OK);
    }

}

package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.senamhi.dto.EstacionDto;
import pe.gob.senamhi.service.EstacionService;

import java.util.List;

@RestController
@RequestMapping(path = "estaciones")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EstacionController {

    @Autowired
    private EstacionService services;

    @GetMapping("/listConvenio")
    public ResponseEntity<List<EstacionDto>> getAllConvenio() {
        List<EstacionDto> dtos = services.getAllConvenio();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping(path = "/get/{codEsta}")
    public ResponseEntity<?> getByCod(@PathVariable String codEsta) throws Exception {
        EstacionDto estacionDto = services.findById(codEsta);
        return new ResponseEntity(estacionDto, HttpStatus.OK);
    }
}

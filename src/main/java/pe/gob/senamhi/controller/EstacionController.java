package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/listar")
    public ResponseEntity<List<EstacionDto>> listar() {
        List<EstacionDto> dtos = services.getAll();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping("/listarConvenio")
    public ResponseEntity<List<EstacionDto>> listarConvenio() {
        List<EstacionDto> dtos = services.getAllConvenio();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
}

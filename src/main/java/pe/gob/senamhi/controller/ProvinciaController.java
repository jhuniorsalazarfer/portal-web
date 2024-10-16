package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.senamhi.dto.ProvinciaDto;
import pe.gob.senamhi.service.ProvinciaService;

import java.util.List;

@RestController
@RequestMapping(path = "provincias")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProvinciaController {
    @Autowired
    private ProvinciaService services;

    @GetMapping("/list")
    public ResponseEntity<List<ProvinciaDto>> getAll() {
        List<ProvinciaDto> dtos = services.getAll();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping(path = "/listConvenio/{codDep}")
    public ResponseEntity<?> getAllConvenio(@PathVariable String codDep) throws Exception {
        List<ProvinciaDto> provinciaDtoList = services.getAllConvenio(codDep);
        return new ResponseEntity(provinciaDtoList, HttpStatus.OK);
    }

}

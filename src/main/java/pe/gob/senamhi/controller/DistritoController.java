package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.senamhi.dto.DistritoDto;
import pe.gob.senamhi.service.DistritoService;

import java.util.List;

@RestController
@RequestMapping(path = "distritos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DistritoController {
    @Autowired
    private DistritoService services;

    @GetMapping("/list")
    public ResponseEntity<List<DistritoDto>> getAll() {
        List<DistritoDto> dtos = services.getAll();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping(path = "/listConvenio/{codDep}/{codProv}")
    public ResponseEntity<?> getAllConvenio(@PathVariable String codProv, @PathVariable String codDep) throws Exception {
        List<DistritoDto> distritoDtoList = services.getAllConvenio(codProv,codDep);
        return new ResponseEntity(distritoDtoList, HttpStatus.OK);
    }
}

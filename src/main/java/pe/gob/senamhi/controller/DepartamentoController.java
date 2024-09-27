package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.senamhi.dto.DepartamentoDto;
import pe.gob.senamhi.service.DepartamentoService;

import java.util.List;

@RestController
@RequestMapping(path = "departamentos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DepartamentoController {

    @Autowired
    private DepartamentoService services;
    
    @GetMapping("/list")
    public ResponseEntity<List<DepartamentoDto>> getAll() {
        List<DepartamentoDto> dtos = services.getAll();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping("/listConvenio")
    public ResponseEntity<List<DepartamentoDto>> getAllConvenio() {
        List<DepartamentoDto> dtos = services.getAllConvenio();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping(path = "/get/{codDep}")
    public ResponseEntity<?> getByCod(@PathVariable String codDep) throws Exception {
        DepartamentoDto departamentoDto = services.findById(codDep);
        return new ResponseEntity(departamentoDto, HttpStatus.OK);
    }
}

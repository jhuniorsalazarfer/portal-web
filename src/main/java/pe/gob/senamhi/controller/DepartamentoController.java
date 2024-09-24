package pe.gob.senamhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.senamhi.dto.DepartamentoDto;
import pe.gob.senamhi.service.DepartamentoService;

import java.util.List;

@RestController
@RequestMapping(path = "departamento")
@CrossOrigin("*")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @GetMapping("/lista")
    public String filtroDepartamento() {
        return "Filtro Dep";
    }

    public ResponseEntity<List<DepartamentoDto>> listar() {
        List<DepartamentoDto> dtos = service.listar();
        return new ResponseEntity(dtos, HttpStatus.OK);
    }
}

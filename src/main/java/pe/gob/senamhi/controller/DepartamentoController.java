package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
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
@RequestMapping(path = "departamentos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DepartamentoController {

    @Autowired
    private DepartamentoService services;

    @GetMapping("/lista")
    public String filtroDepartamento() {
        return "Filtro Dep";
    }
    
    @GetMapping("/listar")
    public ResponseEntity<List<DepartamentoDto>> listar() {
        List<DepartamentoDto> dtos = services.listar();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
}

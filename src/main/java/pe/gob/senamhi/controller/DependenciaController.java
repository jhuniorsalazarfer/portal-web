package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.senamhi.dto.DependenciaDto;
import pe.gob.senamhi.service.DependenciaService;

import java.util.List;

@RestController
@RequestMapping(path = "dependencias")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DependenciaController {

    @Autowired
    private DependenciaService services;

    @GetMapping("/lista")
    public String filtroDepartamento() {
        return "Filtro Dep";
    }

    @GetMapping("/listar")
    public ResponseEntity<List<DependenciaDto>> listar() {
        List<DependenciaDto> dtos = services.getAll();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
}

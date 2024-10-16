package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pe.gob.senamhi.dto.FormulaDto;
import pe.gob.senamhi.dto.PrecipitacionDto;
import pe.gob.senamhi.service.FormulaService;
import pe.gob.senamhi.service.PrecipitacionService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "formulas")
@RequiredArgsConstructor
@CrossOrigin("*")
public class FormulaController {

    @Autowired
    private FormulaService services;

    @GetMapping("/listar")
    public ResponseEntity<List<FormulaDto>> listar() {
        List<FormulaDto> dtos = services.getAll();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @PostMapping(path = "/save")
    public ResponseEntity<?> save(@Valid @RequestBody FormulaDto request, BindingResult result) {
        Optional<FormulaDto> formulaDto = services.save(request);

        if(formulaDto.get().getId() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

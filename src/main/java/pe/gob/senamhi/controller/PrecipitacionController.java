package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pe.gob.senamhi.dto.PrecipitacionDto;
import pe.gob.senamhi.service.PrecipitacionService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "precipitaciones")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PrecipitacionController {

    @Autowired
    private PrecipitacionService services;

    @GetMapping("/listar")
    public ResponseEntity<List<PrecipitacionDto>> listar() {
        List<PrecipitacionDto> dtos = services.getAll();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @PostMapping(path = "/save")
    public ResponseEntity<?> save(@Valid @RequestBody PrecipitacionDto request, BindingResult result) {
        Optional<PrecipitacionDto> precipitacionDto = services.save(request);

        if(precipitacionDto.get().getId() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

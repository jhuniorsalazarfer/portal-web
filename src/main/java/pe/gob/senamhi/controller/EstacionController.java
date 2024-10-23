package pe.gob.senamhi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.senamhi.dto.DataEstacionDto;
import pe.gob.senamhi.dto.EstacionDto;
import pe.gob.senamhi.dto.EstacionReponseDto;
import pe.gob.senamhi.service.DataVariableService;
import pe.gob.senamhi.service.EstacionService;

import java.util.List;

@RestController
@RequestMapping(path = "estaciones")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EstacionController {

    @Autowired
    private EstacionService services;

    @Autowired
    private DataVariableService dataVariableService;

    @GetMapping("/listConvenio")
    public ResponseEntity<List<EstacionDto>> getAllConvenio() {
        List<EstacionDto> dtos = services.getAllConvenio();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping(path = "/get/{codEsta}")
    public ResponseEntity<?> getByCod(@PathVariable String codEsta) throws Exception {
        EstacionReponseDto estacionReponseDto = services.findByIdDetail(codEsta);
        return new ResponseEntity(estacionReponseDto, HttpStatus.OK);
    }

    @GetMapping(path = "/get/{codEsta}")
    public ResponseEntity<?> getDataEstacion(@PathVariable String codEsta) throws Exception {
        DataEstacionDto dataEstacionDto = dataVariableService.findByCodEstacionDetail(codEsta);
        return new ResponseEntity(dataEstacionDto, HttpStatus.OK);
    }
}

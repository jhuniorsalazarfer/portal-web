package pe.gob.senamhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "filtros")
public class FiltroController {

    @GetMapping("/lista")
    public String filtroDepartamento() {
        return "Filtro Dep";
    }
}

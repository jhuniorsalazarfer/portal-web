package pe.gob.senamhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "filtross")
public class PruebaController {
	
	@GetMapping("/listas")
	public String filtroDepartamento() {
		return "Filtro Depa";
	}
}

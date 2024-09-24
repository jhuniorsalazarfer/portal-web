package pe.gob.senamhi.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoDto {
    
	private String codigoPais;
    private String codDepartamento;
    private String nomDepartamento;
    private String numPersonas;
    private String areaDeparmanto;
}
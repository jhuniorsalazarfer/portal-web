package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormulaDto extends ComunDto {
    @NotBlank(message = "es requerido")
    private Integer variableA;
    @NotBlank(message = "es requerido")
    private Integer variableB;
    @NotBlank(message = "es requerido")
    private String operacion1;
    private String operacion2;
    @NotBlank(message = "es requerido")
    private String codigoEstacion;
}

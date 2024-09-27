package pe.gob.senamhi.dto;
import lombok.*;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistritoDto {
    private String codDistrito;
    private String codigoPais;
    private String codDepartamento;
    private String codProvincia;
    private String nomDistrito;
}

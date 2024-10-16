package pe.gob.senamhi.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvinciaDto {
    private String codProvincia;
    private String codigoPais;
    private String codDepartamento;
    private String nomProvincia;
}

package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaEstacionDto {
    private String codigoCategoria;
    private String codigoTipo;
    private String descripcionCategoriaL;
    private String descripcionCategoriaC;
}

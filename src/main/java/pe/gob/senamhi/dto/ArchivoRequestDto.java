package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArchivoRequestDto {

    private String nombre;
    private String archivo;
    private String codigoEstacion;

}

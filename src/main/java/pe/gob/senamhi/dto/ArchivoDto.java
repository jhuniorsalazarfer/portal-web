package pe.gob.senamhi.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArchivoDto extends ComunDto{

    private String nombre;
    private String archivo;
    private String codigoEstacion;
    private String mimetype;
    private String estension;

}

package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstacionReponseDto {
    private String codEstacion;
    private String nombreEstacion;
    private String nombreDepartamento;
    private String nombreProvincia;
    private String nombreDistrito;
    private String longitudGrado;
    private String longitudMinuto;
    private String longitudSegundo;
    private String longitudSIG;
    private String latitudGrado;
    private String latitudMinuto;
    private String latitudSegundo;
    private String latitudSIG;
    private String alturamsnm;
    private String codCondicion;
    private String codigoTipoEstacion;
    private String claseEstacion;

    private TipoEstacionDto tipoEstacion;
    private CategoriaEstacionDto categoriaEstacion;
}

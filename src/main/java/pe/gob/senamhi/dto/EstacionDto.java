package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstacionDto {
    private String codEstacion;
    private String codTipoEstacion;
    private String nombreEstacion;
    private String codCategoria;
    private String codDepartamento;
    private String codProvincia;
    private String codDistrito;
    private String nombreAnteriorEstacion;
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
}

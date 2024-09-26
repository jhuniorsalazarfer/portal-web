package pe.gob.senamhi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SEMAP_ESTA", schema = "VMHCUZCO")
public class Estacion {

    @Id
    @Column(name = "V_COD_ESTA")
    private String codEstacion;

    @Column(name = "V_COD_TIPO")
    private String codTipoEstacion;

    @Column(name = "V_NOM_ESTA")
    private String nombreEstacion;

    @Column(name = "V_COD_CATE")
    private String codCategoria;

    @Column(name = "V_COD_DEP")
    private String codDepartamento;

    @Column(name = "V_COD_PROV")
    private String codProvincia;

    @Column(name = "V_COD_DIST")
    private String codDistrito;

    @Column(name = "V_NOM_ANESTA")
    private String nombreAnteriorEstacion;

    @Column(name = "N_LON_GRAD")
    private String longitudGrado;

    @Column(name = "N_LON_MIN")
    private String longitudMinuto;

    @Column(name = "N_LON_SEG")
    private String longitudSegundo;

    @Column(name = "N_LON_SIG")
    private String longitudSIG;

    @Column(name = "N_LAT_GRAD")
    private String latitudGrado;

    @Column(name = "N_LAT_MIN")
    private String latitudMinuto;

    @Column(name = "N_LAT_SEG")
    private String latitudSegundo;

    @Column(name = "N_LAT_SIG")
    private String latitudSIG;

    @Column(name = "N_ALT_MTS")
    private String alturamsnm;

    @Column(name = "V_COD_COND")
    private String codCondicion;

    @Column(name = "V_SUB_ESTA")
    private String codigoTipoEstacion;

    @Column(name = "V_CLAS_ESTA")
    private String claseEstacion;

}

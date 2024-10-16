package pe.gob.senamhi.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "SEMAP_ESTA", schema = "VMHCUZCO")
public class Estacion {

    @Id
    @Column(name = "V_COD_ESTA")
    private String codEstacion;

    @Column(name = "V_COD_TIPO",insertable = false, updatable = false)
    private String codTipoEstacion;

    @Column(name = "V_NOM_ESTA")
    private String nombreEstacion;

    @Column(name = "V_COD_CATE",insertable = false, updatable = false)
    private String codCategoria;

    @Column(name = "V_COD_DEP",insertable = false, updatable = false)
    private String codDepartamento;

    @Column(name = "V_COD_PROV",insertable = false, updatable = false)
    private String codProvincia;

    @Column(name = "V_COD_DIST",insertable = false, updatable = false)
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

    @OneToMany(mappedBy = "estacion")
    @JsonIgnoreProperties("estacion")
    private Set<EstacionConvenio> estacionConvenios = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "V_COD_CATE")
    @JsonIgnoreProperties("estacions")
    private CategoriaEstacion categoriaEstacion;

    @ManyToOne
    @JoinColumn(name = "V_COD_TIPO")
    @JsonIgnoreProperties("estacions")
    private TipoEstacion tipoEstacion;

    @ManyToOne
    @JoinColumn(name = "V_COD_DEP")
    @JsonIgnoreProperties("estacions")
    private Departamento departamento;

}

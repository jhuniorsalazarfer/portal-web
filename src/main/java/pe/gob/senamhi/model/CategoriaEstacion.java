package pe.gob.senamhi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "SEMAP_CATE", schema = "VMHCUZCO")
public class CategoriaEstacion {

    @Id
    @Column(name = "V_COD_CATE")
    private String codigoCategoria;

    @Column(name = "V_COD_TIPO")
    private String codigoTipo;

    @Column(name = "V_DESL_CATE")
    private String descripcionCategoriaL;

    @Column(name = "V_DESC_CATE")
    private String descripcionCategoriaC;

    @OneToMany(mappedBy = "categoriaEstacion")
    @JsonIgnoreProperties("categoriaEstacion")
    private Set<Estacion> estacions = new HashSet<>();

}

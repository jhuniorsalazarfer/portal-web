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
@Table(name = "SEMAP_TIPO", schema = "VMHCUZCO")
public class TipoEstacion {
    @Id
    @Column(name = "V_COD_TIPO")
    private String codigoTipo;

    @Column(name = "V_DES_TIPO")
    private String descripcionTipo;

    @OneToMany(mappedBy = "tipoEstacion")
    @JsonIgnoreProperties("tipoEstacion")
    private Set<Estacion> estacions = new HashSet<>();
}

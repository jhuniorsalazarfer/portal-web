package pe.gob.senamhi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "MCD_ESTA_CONV", schema = "VMHCUZCO")
public class EstacionConvenio {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "COD_ESTA",insertable = false, updatable = false)
    private String codigoEsta;

    @Column(name = "ID_CONV")
    private String codConvenio;

    @Column(name = "ESTADO")
    private Integer estado;

    @Column(name = "CREATED_AT")
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "COD_ESTA")
    @JsonIgnoreProperties("estacionConvenios")
    private Estacion estacion;
}

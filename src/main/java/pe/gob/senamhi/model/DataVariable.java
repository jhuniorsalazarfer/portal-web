package pe.gob.senamhi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "DADMVD_DATA", schema = "VMHCUZCO")
public class DataVariable {

    @Column(name = "V_COD_ESTA")
    private String codEstacion;

    @Column(name = "D_FECHA_REG")
    private Date fechaRegistro;

    @Column(name = "V_COD_VAR")
    private Integer codVariable;

    @Column(name = "N_VALOR")
    private Double abrevVariable;

    @Column(name = "B_VALOR")
    private Double bValor;

    @Column(name = "V_COD_FUENTE")
    private Double codFuente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "D_FECHA_INSERT")
    private Date fechaInsercion;

    @ManyToOne
    @JoinColumn(name = "V_COD_VAR")
    @JsonIgnoreProperties("dataVariables")
    private Variable variable;

}

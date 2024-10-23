package pe.gob.senamhi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(DataVariableId.class)
@Table(name = "DADMVD_DATA", schema = "VMHCUZCO")
public class DataVariable {
	
	@Column(name = "V_COD_ESTA", insertable = false, updatable = false)
    private String codEstacion;

    @Column(name = "D_FECHA_REG")
    private Date fechaRegistro;
    @Id
    @Column(name = "V_COD_VAR", insertable = false, updatable = false)
    private Integer codVariable;
    @Id
    @Column(name = "N_VALOR")
    private Double valor;

    @Column(name = "B_VALOR")
    private String bValor;

    @Column(name = "V_COD_FUENTE")
    private String codFuente;
    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "D_FECHA_INSERT")
    private Date fechaInsercion;

//    @ManyToOne
//    @JoinColumn(name = "V_COD_VAR")
//    @JsonIgnoreProperties("dataVariables")
//    private Variable variable;

}

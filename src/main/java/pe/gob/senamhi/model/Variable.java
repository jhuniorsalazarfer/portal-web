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
@Table(name = "DADTBP_VARIABLE", schema = "VMHCUZCO")
public class Variable {

    @Id
    @Column(name = "V_COD_VAR")
    private Integer codVariable;

    @Column(name = "V_NOM_VAR")
    private String nombreVariable;

    @Column(name = "V_DESC_VAR")
    private String descVariable;

    @Column(name = "V_ABREV_VAR")
    private String abrevVariable;

//    @OneToMany(mappedBy = "variable")
//    @JsonIgnoreProperties("variable")
//    private Set<DataVariable> dataVariables = new HashSet<>();
}

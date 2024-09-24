package pe.gob.senamhi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "SEMAP_DEPA", schema = "VMHCUZCO")
public class Departamento {

    @Id
    @Column(name = "V_COD_DEP")
    private String codDepartamento;

    @Column(name = "V_COD_PAIS")
    private String codigoPais;

    @Column(name = "V_NOM_DEP")
    private String nomDepartamento;

    @Column(name = "N_PER_DEP")
    private String numPersonas;

    @Column(name = "N_AREA_DEP")
    private String areaDeparmanto;

//    @OneToMany(mappedBy = "departamento")
//    @JsonIgnoreProperties("departamento")
//    private Set<Provincia> provincias = new HashSet<>();
}

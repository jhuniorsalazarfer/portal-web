package pe.gob.senamhi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@Entity
@Table(name = "SEMAP_PROV", schema = "VMHCUZCO")
public class Provincia {

    @Id
    @Column(name = "V_COD_PROV")
    private String codProvincia;

    @Column(name = "V_COD_PAIS")
    private String codigoPais;

    @Column(name = "V_COD_DEP")
    private String codDepartamento;

    @Column(name = "V_NOM_PROV")
    private String nomProvincia;

}

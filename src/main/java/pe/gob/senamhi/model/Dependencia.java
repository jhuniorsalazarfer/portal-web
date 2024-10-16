package pe.gob.senamhi.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "pw_dependencia", schema = "VMHCUZCO")
public class Dependencia implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "ID")
    private Long id;

    @Column(name = "DEPENDENCIA")
    private String dependencia;

    @Column(name = "OFICINA")
    private String oficina;

}

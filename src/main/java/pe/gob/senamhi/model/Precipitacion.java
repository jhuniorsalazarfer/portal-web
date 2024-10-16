package pe.gob.senamhi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "PW_PRECIPITACION", schema = "VMHCUZCO")
public class Precipitacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VMHCUZCO.SEQ_PRECIPITACION")
    @SequenceGenerator(sequenceName = "VMHCUZCO.SEQ_PRECIPITACION", allocationSize = 1, name = "VMHCUZCO.SEQ_PRECIPITACION")
    private Integer id;

    @Column(name = "VALOR")
    private Integer valor;

    @Column(name = "ESTADO", columnDefinition = "NUMBER DEFAULT 1")
    private Integer estado;

    @Column(name = "CREATED_AT", columnDefinition = "DATE DEFAULT SYSDATE")
    private Date fechaRegistro;

    @Column(name = "UPDATED_AT")
    private Date fechaActualizacion;

}

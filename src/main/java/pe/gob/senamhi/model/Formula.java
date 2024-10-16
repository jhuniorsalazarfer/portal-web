package pe.gob.senamhi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "PW_FORMULA", schema = "VMHCUZCO")
public class Formula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VMHCUZCO.SEQ_FORMULA")
    @SequenceGenerator(sequenceName = "VMHCUZCO.SEQ_FORMULA", allocationSize = 1, name = "VMHCUZCO.SEQ_FORMULA")
    private Integer id;

    @Column(name = "VAR_A")
    private Integer variableA;

    @Column(name = "VAR_B")
    private Integer variableB;

    @Column(name = "OPERACION_1")
    private String operacion1;

    @Column(name = "OPERACION_2")
    private String operacion2;

    @Column(name = "COD_ESTA")
    private String codigoEstacion;

    @Column(name = "ESTADO", columnDefinition = "NUMBER DEFAULT 1")
    private Integer estado;

    @Column(name = "CREATED_AT", columnDefinition = "DATE DEFAULT SYSDATE")
    private Date fechaRegistro;

    @Column(name = "UPDATED_AT")
    private Date fechaActualizacion;

    @Column(name = "FECHA_CADUCIDAD")
    private Date fechaCaducidad;
}

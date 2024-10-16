package pe.gob.senamhi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "PW_ARCHIVO", schema = "VMHCUZCO")
public class Archivo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VMHCUZCO.SEQ_ARCHIVO")
    @SequenceGenerator(sequenceName = "VMHCUZCO.SEQ_ARCHIVO", allocationSize = 1, name = "VMHCUZCO.SEQ_ARCHIVO")
    private Integer id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "ARCHIVO")
    private String archivo;

    @Column(name = "COD_ESTA")
    private String codigoEstacion;

    @Column(name = "ESTADO", columnDefinition = "NUMBER DEFAULT 1")
    private Integer estado;

    @Column(name = "CREATED_AT", columnDefinition = "DATE DEFAULT SYSDATE")
    private Date fechaRegistro;

    @Column(name = "UPDATED_AT")
    private Date fechaActualizacion;
}

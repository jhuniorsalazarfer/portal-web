package pe.gob.senamhi.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DataVariableId implements Serializable {
    private Integer codVariable;
    private Double valor;
    private Date fechaInsercion;
}

package pe.gob.senamhi.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DataVariableId implements Serializable {
	private Date fechaRegistro;
	private Integer codVariable;
    private Double valor;
}

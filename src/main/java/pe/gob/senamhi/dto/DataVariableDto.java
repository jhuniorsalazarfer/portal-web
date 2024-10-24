package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataVariableDto {

    private String codEstacion;
    private Date fechaRegistro;
    private Integer codVariable;
    private Double valor;
    private String bValor;
    private String codFuente;
    private Date fechaInsercion;

    private VariableDto variable ;
}

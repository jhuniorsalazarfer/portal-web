package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataVariableResponseDto {

    private Date fechaRegistro;
    private String nivelReg10min;
    private String nivelHorario;
    private String caudalReg10min;
    private String caudalHorario;
    private String precipitacionAcumu10min;
    private String intensidadLluviaHoraria;
    private String nivelRegRadar10min;
    private String nivelHorario2;
    private String caudalRegRadar10min;
    private String caudalHorario2;
    private VariableDto variable ;

}

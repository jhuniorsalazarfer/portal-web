package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataEstacionDto {

    private EstacionReponseDto estacionReponse;
    private ArchivoDto archivo;
    private List<DataVariableDto> dataHidrometricaHorario ;
    private List<DataVariableDto> dataHidrometricaReporte ;
}

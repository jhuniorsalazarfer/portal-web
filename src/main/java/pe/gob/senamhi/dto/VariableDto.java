package pe.gob.senamhi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VariableDto {

    private Integer codVariable;
    private String nombreVariable;
    private String descVariable;
    private String abrevVariable;
}

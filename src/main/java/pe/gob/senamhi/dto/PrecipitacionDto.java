package pe.gob.senamhi.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrecipitacionDto extends ComunDto{

    @NotBlank(message = "es requerido")
    private Integer valor;

}




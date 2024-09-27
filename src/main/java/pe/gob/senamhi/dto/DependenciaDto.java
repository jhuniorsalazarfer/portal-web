package pe.gob.senamhi.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DependenciaDto {
    private Long id;
    private String dependencia;
    private String oficina;
}

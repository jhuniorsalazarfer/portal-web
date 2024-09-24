package pe.gob.senamhi.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DependenciaDto {
    private Long id;
    private String dependencia;
    private String oficina;
}

package pe.gob.senamhi.config;

public interface MapperService<Q, S>{
    S convertToDto(Q request);

    Q convertToEntity(S request);
}

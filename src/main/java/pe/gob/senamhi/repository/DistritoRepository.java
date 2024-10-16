package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Distrito;

import java.util.Optional;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, String> {
    @Query(value = "select d from Distrito d where d.codDistrito=:codDistrito and d.codProvincia=:codProvincia and d.codDepartamento=:codDepartamento")
    Optional<Distrito> finByConDistAndCodProvAndCodDep(@Param("codDistrito") String codDistrito,@Param("codProvincia") String codProvincia, @Param("codDepartamento") String codDepartamento);
}

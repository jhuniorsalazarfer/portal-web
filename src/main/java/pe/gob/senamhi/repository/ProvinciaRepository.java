package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Provincia;

import java.util.Optional;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia, String> {

    @Query(value = "select p from Provincia p where p.codProvincia=:codProvincia and p.codDepartamento=:codDepartamento")
    Optional<Provincia> finByCodProvAndCodDep(@Param("codProvincia") String codProvincia, @Param("codDepartamento") String codDepartamento);
}

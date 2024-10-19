package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Archivo;
import pe.gob.senamhi.model.Estacion;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArchivoRepository extends JpaRepository<Archivo, Integer> {

    @Query(value = "select a from Archivo a " +
            "WHERE a.codigoEstacion=:codEstacion")
    Optional<Archivo> findByCodigoEstacion(@Param("codEstacion") String codEstacion);
}

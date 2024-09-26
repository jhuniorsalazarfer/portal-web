package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Estacion;

import java.util.List;

@Repository
public interface EstacionRepository extends JpaRepository<Estacion, String> {

    @Query(value = "select e from Estacion e where e.codEstacion like %:codConvenio%")
    List<Estacion> finByCodConvenio(@Param("codConvenio") String codConvenio);
}

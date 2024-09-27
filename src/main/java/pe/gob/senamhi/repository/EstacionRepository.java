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

    @Query(value = "select e from Estacion e where e.codEstacion like %:codConvenio% and e.codDepartamento=:codDepartamento")
    List<Estacion> finByCodConvenioAndCodDep(@Param("codConvenio") String codConvenio, @Param("codDepartamento") String codDepartamento);

    @Query(value = "select e from Estacion e where e.codEstacion like %:codConvenio% and e.codProvincia=:codProvincia and e.codDepartamento=:codDepartamento")
    List<Estacion> finByCodConvenioAndCodDepAndCodProv(@Param("codConvenio") String codConvenio, @Param("codProvincia") String codProvincia, @Param("codDepartamento") String codDepartamento);
}

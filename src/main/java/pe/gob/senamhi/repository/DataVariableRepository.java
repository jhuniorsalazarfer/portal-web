package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.DataVariable;

import java.util.Date;
import java.util.List;

@Repository
public interface DataVariableRepository extends JpaRepository<DataVariable, String> {

    @Query(value = "select d from DataVariable d "+
            "WHERE d.fechaInsercion >= :fechaParametro and d.fechaInsercion <= CURRENT_TIMESTAMP and d.codEstacion :codEstacion")
    List<DataVariable> listByFechaAndCodEstacion(@Param("fechaParametro") Date fechaParametro, @Param("codConvenio") String codEstacion);

}

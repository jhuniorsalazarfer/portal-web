package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.DataVariable;

import java.util.Date;
import java.util.List;

@Repository
public interface DataVariableRepository extends JpaRepository<DataVariable, Long> {

    @Query(value = "select d from DataVariable d "+
            "WHERE d.codEstacion = :codEstacion and d.fechaInsercion >= :fechaParametro and d.fechaInsercion <= CURRENT_TIMESTAMP")
    List<DataVariable> GetByFechaAndCodEstacion(@Param("fechaParametro") Date fechaParametro, @Param("codEstacion") String codEstacion);

}

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
            "WHERE d.codEstacion = :codEstacion and d.fechaRegistro >= :fechaParametro and d.fechaRegistro <= CURRENT_TIMESTAMP ORDER BY d.fechaRegistro DESC")
    List<DataVariable> ListByFechaAndCodEstacion(@Param("fechaParametro") Date fechaParametro, @Param("codEstacion") String codEstacion);

    @Query(value = "select d from DataVariable d "+
            "WHERE d.codEstacion = :codEstacion and d.fechaRegistro = :codVariable and d.fechaRegistro >= :fechaParametro and d.fechaInsercion <= CURRENT_TIMESTAMP")
    List<DataVariable> ListByFechaAndVariableAndCodEstacion(@Param("fechaParametro") Date fechaParametro, @Param("codVariable") Integer codVariable, @Param("codEstacion") String codEstacion);


}

package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Precipitacion;

@Repository
public interface PrecipitacionRepository extends JpaRepository<Precipitacion, Integer> {

    @Query("select count(*) from Precipitacion n where n.valor = :a1")
    int existsByValor(@Param("a1") Integer var1);
}

package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.TipoEstacion;
@Repository
public interface TipoEstacionRepository extends JpaRepository<TipoEstacion, String> {
}

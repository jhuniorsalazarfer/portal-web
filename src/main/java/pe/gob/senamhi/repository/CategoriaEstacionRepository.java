package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.CategoriaEstacion;
@Repository
public interface CategoriaEstacionRepository extends JpaRepository<CategoriaEstacion, String> {
}

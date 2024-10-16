package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Dependencia;

@Repository
public interface DependenciaRepository extends JpaRepository<Dependencia, Long> {

}

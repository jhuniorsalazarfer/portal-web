package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Provincia;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia, String> {
}

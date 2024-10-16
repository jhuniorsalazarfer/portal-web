package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Archivo;

@Repository
public interface ArchivoRepository extends JpaRepository<Archivo, Integer> {
}

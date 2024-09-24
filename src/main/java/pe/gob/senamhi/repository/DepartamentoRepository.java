package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Departamento;
@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, String> {

}

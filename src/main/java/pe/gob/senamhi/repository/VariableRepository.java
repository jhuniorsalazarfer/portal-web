package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Variable;
@Repository
public interface VariableRepository extends JpaRepository<Variable, Integer> {
}

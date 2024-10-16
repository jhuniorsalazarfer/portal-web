package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.Formula;
@Repository
public interface FormulaRepository extends JpaRepository<Formula, Integer> {

}

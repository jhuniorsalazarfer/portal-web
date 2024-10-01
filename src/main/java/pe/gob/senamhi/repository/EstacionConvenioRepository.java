package pe.gob.senamhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.gob.senamhi.model.EstacionConvenio;
@Repository
public interface EstacionConvenioRepository extends JpaRepository <EstacionConvenio, Long>{
}

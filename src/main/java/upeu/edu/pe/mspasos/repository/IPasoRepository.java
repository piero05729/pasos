package upeu.edu.pe.mspasos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.mspasos.domain.Pasos;

@Repository
public interface IPasoRepository extends JpaRepository <Pasos, Long> {
}

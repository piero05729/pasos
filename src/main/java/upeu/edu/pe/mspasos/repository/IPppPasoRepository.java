package upeu.edu.pe.mspasos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.mspasos.domain.Pasos_ppp;

import java.util.List;
public interface IPppPasoRepository {
    List<Pasos_ppp> findByPppId(Long pppId);
}
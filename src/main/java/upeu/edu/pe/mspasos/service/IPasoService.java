package upeu.edu.pe.mspasos.service;

import upeu.edu.pe.mspasos.domain.Pasos;
import java.util.List;
import java.util.Optional;

public interface IPasoService {
    Pasos create(Pasos paso);
    Pasos update(Pasos paso);
    void delete(Long id);
    Optional<Pasos> read(Long id);
    List<Pasos> readAll();
}
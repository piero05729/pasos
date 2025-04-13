package upeu.edu.pe.mspasos.service;

import upeu.edu.pe.mspasos.domain.Pasos_ppp;

import java.util.List;
import java.util.Optional;

public interface IPppPasoService {
    Pasos_ppp create(Pasos_ppp pppPaso);
    Pasos_ppp update(Pasos_ppp pppPaso);
    void delete(Long id);
    Optional<Pasos_ppp> read(Long id);
    List<Pasos_ppp> readAll();
    List<Pasos_ppp> findByPppId(Long pppId);
}

package upeu.edu.pe.mspasos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.mspasos.domain.Pasos;
import upeu.edu.pe.mspasos.repository.IPasoRepository;
import upeu.edu.pe.mspasos.service.IPasoService;

import java.util.List;
import java.util.Optional;

@Service
public class IPasoServiceImpl implements IPasoService {

    @Autowired
    private IPasoRepository pasoRepository;

    @Override
    public Pasos create(Pasos paso) {
        return pasoRepository.save(paso);
    }

    @Override
    public Pasos update(Pasos paso) {
        return pasoRepository.save(paso);
    }

    @Override
    public void delete(Long id) {
        pasoRepository.deleteById(id);
    }

    @Override
    public Optional<Pasos> read(Long id) {
        return pasoRepository.findById(id);
    }

    @Override
    public List<Pasos> readAll() {
        return pasoRepository.findAll();
    }
}
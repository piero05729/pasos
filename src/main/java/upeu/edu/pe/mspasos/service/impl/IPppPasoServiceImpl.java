package upeu.edu.pe.mspasos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.mspasos.domain.Pasos_ppp;
import upeu.edu.pe.mspasos.repository.IPppPasoRepository;
import upeu.edu.pe.mspasos.service.IPppPasoService;


import java.util.List;
import java.util.Optional;

@Service
public class IPppPasoServiceImpl implements IPppPasoService {

    @Autowired
    private IPppPasoRepository pppPasoRepository;

    @Override
    public Pasos_ppp create(Pasos_ppp pppPaso) {
        return pppPasoRepository.save(pppPaso);
    }

    @Override
    public Pasos_ppp update(Pasos_ppp pppPaso) {
        return pppPasoRepository.save(pppPaso);
    }

    @Override
    public void delete(Long id) {
        pppPasoRepository.deleteById(id);
    }

    @Override
    public Optional<Pasos_ppp> read(Long id) {
        return pppPasoRepository.findById(id);
    }

    @Override
    public List<Pasos_ppp> readAll() {
        return pppPasoRepository.findAll();
    }

    @Override
    public List<Pasos_ppp> findByPppId(Long pppId) {
        return pppPasoRepository.findByPppId(pppId);
    }
}

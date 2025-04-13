
package upeu.edu.pe.mspasos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.mspasos.domain.Pasos_ppp;
import upeu.edu.pe.mspasos.service.IPppPasoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ppp-pasos")
public class PppPasoController {

    @Autowired
    private IPppPasoService pppPasoService;

    @GetMapping
    public ResponseEntity<List<Pasos_ppp>> listar() {
        List<Pasos_ppp> lista = pppPasoService.readAll();
        if (lista.isEmpty()) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/ppp/{pppId}")
    public ResponseEntity<List<Pasos_ppp>> listarPorPpp(@PathVariable Long pppId) {
        List<Pasos_ppp> pasos = pppPasoService.findByPppId(pppId);
        if (pasos.isEmpty()) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(pasos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pasos_ppp> guardar(@RequestBody Pasos_ppp pppPaso) {
        return new ResponseEntity<>(pppPasoService.create(pppPaso), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pasos_ppp> buscar(@PathVariable Long id) {
        Optional<Pasos_ppp> paso = pppPasoService.read(id);
        return paso.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pasos_ppp> actualizar(@PathVariable Long id, @RequestBody Pasos_ppp pppPaso) {
        Optional<Pasos_ppp> actual = pppPasoService.read(id);
        if (actual.isPresent()) {
            pppPaso.setId(id);
            return new ResponseEntity<>(pppPasoService.update(pppPaso), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        pppPasoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

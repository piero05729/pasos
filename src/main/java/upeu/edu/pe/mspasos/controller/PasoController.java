package upeu.edu.pe.mspasos.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.mspasos.domain.Pasos;
import upeu.edu.pe.mspasos.service.IPasoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pasos")
public class PasoController {

    @Autowired
    private IPasoService pasoService;

    @GetMapping
    public ResponseEntity<List<Pasos>> listar() {
        List<Pasos> lista = pasoService.readAll();
        if (lista.isEmpty()) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pasos> guardar(@RequestBody Pasos paso) {
        return new ResponseEntity<>(pasoService.create(paso), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pasos> buscar(@PathVariable Long id) {
        Optional<Pasos> paso = pasoService.read(id);
        return paso.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pasos> actualizar(@PathVariable Long id, @RequestBody Pasos paso) {
        Optional<Pasos> actual = pasoService.read(id);
        if (actual.isPresent()) {
            paso.setId(id);
            return new ResponseEntity<>(pasoService.update(paso), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        pasoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

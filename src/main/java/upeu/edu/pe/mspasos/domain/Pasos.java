package upeu.edu.pe.mspasos.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pasos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pasos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "permiso")
    private String permiso;

    @Column(name = "url")
    private String url;
}

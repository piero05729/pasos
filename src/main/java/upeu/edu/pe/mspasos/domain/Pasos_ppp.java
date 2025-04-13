package upeu.edu.pe.mspasos.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ppp_pasos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pasos_ppp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comentarios")
    private String comentarios;

    @Column(name = "estado")
    private String estado;

    @Column(name = "pasos_id")
    private Long pasosId;

    @Column(name = "ppp_id")
    private Long pppId;
}

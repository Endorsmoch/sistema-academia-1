package edu.uady.escolar.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="kardex")
@Data
@NoArgsConstructor
public class Kardex {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name ="folio")
    private String folioKardex;
    @Column(name = "clave_materia", nullable = false, precision = 30)
    private String claveMateria;
    @Column(name = "calificacion", nullable = false, precision = 6)
    private Double calificacion;
    @ManyToOne
    @JoinColumn( name = "alumno_id")
    private Alumno alumno;


}

package org.kevin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ObjetivoAhorro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_objetivo_ahorro")
    private Long idObjetivoAhorro;

    @Column(name = "nombre_objetivo", nullable = false, length = 100)
    private String nombreObjetivo;

    @Column(name = "cantidad_objetivo", nullable = false)
    private int cantidadObjetivo;

    @Column(name = "cantidad_ahorrada", nullable = false)
    private int cantidadAhorrada;

    @Column(name = "fecha_Limite", nullable = false)
    private Date fechaLimite;

}

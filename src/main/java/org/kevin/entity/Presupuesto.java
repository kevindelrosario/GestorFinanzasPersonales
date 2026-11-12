package org.kevin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Presupuesto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presupuesto")
    private Long idPresupuesto;

    @Column(name = "importe_limite", nullable = false)
    private int importeLimite;

    @Column(name ="mes", nullable = false)
    private String mes;

    @Column(name ="año", nullable = false)
    private int ano;

    //RELACION CON CATEGORIA ManyToOne
    //MUCHOS presupuestos pertenecen a 1 categiria
    //UNA categoria pertenece a MUCHOS presupuestos
    @ManyToOne
    @JoinColumn(name ="id_categoria", referencedColumnName = "id_categoria")
    private Categoria categoria;
}

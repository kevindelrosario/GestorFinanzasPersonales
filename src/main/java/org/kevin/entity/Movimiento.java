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
@Table(name = "Movimiento")
public class Movimiento implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_movimiento")
    private Long idMovimiento;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "importe", nullable = false)
    private int importe;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "tipo_movimiento", nullable = false)
    private TipoMovimiento tipoMovimiento;

    //RELACION CON CATEGORIA (manyToOne)
    //MUCHOS movimientos pueden pertenecer a 1 categoria y
    //UNA categoria puede pertenecer a MUCHOS movimientos
    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria", nullable = false)
    private Categoria categoria;

}

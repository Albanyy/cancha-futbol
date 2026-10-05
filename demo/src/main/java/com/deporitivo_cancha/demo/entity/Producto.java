package com.deporitivo_cancha.demo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table (name = "Producto") 
public class Producto {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "descripcion")
    private String descripcion;

    @Column (name = "tipoPorducto")
    private TipoProducto tipoProducto;

    @Column (name = "precio")
    private BigDecimal precio;

    @Column (name = "stock")
    private Integer stock;

    @Column (name = "stockMinimo")
    private Integer stockMinimo;

}

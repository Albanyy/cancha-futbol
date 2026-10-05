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
@Table(name = "Cancha")

public class Cancha {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long id;

    @Column (name = "Nombre")
    private String nombre;

    @Column (name = "tipo")
    private TipoCancha tipo;

    @Column (name = "precioPorHora")
    private BigDecimal precioPorHora;

    @Column (name = "estado")
    private EstadoCancha estado;

}

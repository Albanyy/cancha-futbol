package com.deporitivo_cancha.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity 
@Table (name = "Cliente")
public class Cliente {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name =" id")
    private Long id;

    @Column (name = "documento")
    private String documento;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "apellido")
    private String apellido;

    @Column (name = "email")
    private String email;

    @Column (name = "telefono")
    private String telefono;

}

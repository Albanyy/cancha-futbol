package com.deporitivo_cancha.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "Factura")
public class Factura {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @ManyToOne 
    @JoinColumn (name = "cliente_id")
    private Cliente cliente;

    @OneToMany 
    @JoinColumn (name = "reserva_id")
    private Reserva reserva;

    @Column (name = "fechaEmision")
    private LocalDateTime fechaEmision;

    @Column (name = "montoSubtotal")
    private BigDecimal montoSubtotal;

    @Column (name = "impuesto")
    private BigDecimal impuesto;

    @Column (name = "montoTotal")
    private BigDecimal montoTotal;

    @Column (name = "metodoPago")
    private MetodoPago metodoPago;

    @Column (name = "estadoPago")
    private EstadoPago estadoPago;
}

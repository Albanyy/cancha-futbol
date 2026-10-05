package com.deporitivo_cancha.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity 
@Table (name = "Reserva")
public class Reserva {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "fechaReserva")
    private LocalDate fechaReserva;

    @Column (name = "horaInicio")
    private LocalTime horaInicio;

    @Column (name = "horaFin")
    private LocalTime horaFin;

    @Column (name = "estado")
    private EstadoReserva estado;

    @Column (name = "montoTotal")
    private BigDecimal montoTotal;

    @Column (name = "creadoEn")
    private LocalDateTime creadoEn;

}

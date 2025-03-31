package com.cursomicroservice.cursomicroservice.model.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private Long docente;
    private Integer duracionHoras;
    private String modalidad;
    private Integer cuposDisponibles;
    private String horario;
    private String requisitos;
    private Boolean activo;
    private LocalDate fechaCreacion;

}

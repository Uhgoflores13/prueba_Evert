package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;


@Entity
@Table(name = "programaEjecutar")
public class programaEjecutar {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

     @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    public programaEjecutar() {
    }

    public programaEjecutar(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    
}

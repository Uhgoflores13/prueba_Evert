package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;


@Entity
@Table(name = "programaEjecutar")
public class Parametro {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String opcion;

    @ManyToOne
    @JoinColumn(name = "comando_id") 
    private comandoPrincipal ComandoPrincipal;

     @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    public Parametro() {
    }

    public Parametro(Long id, String opcion, comandoPrincipal ComandoPrincipal) {
        this.id = id;
        this.opcion = opcion;
        this.ComandoPrincipal = ComandoPrincipal;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return opcion;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public comandoPrincipal getComandoPrincipal() {
        return ComandoPrincipal;
    }

    public void setComandoPrincipal(comandoPrincipal comandoPrincipal) {
        ComandoPrincipal = comandoPrincipal;
    }

    public void setNombre(String nombre) {
        this.opcion = nombre;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    
}

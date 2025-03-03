package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.programaEjecutar;

public interface IProgramaEjecutar extends JpaRepository<programaEjecutar, Long> {

}

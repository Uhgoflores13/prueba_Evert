package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.comandoPrincipal;

public interface IComandoPrincipal extends JpaRepository<comandoPrincipal, Long> {

}

package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.Parametro;

import java.util.List;

public interface IParametro extends JpaRepository<Parametro, Long> {


    List<Parametro> findByComandoPrincipalNombre(String nombre);
}

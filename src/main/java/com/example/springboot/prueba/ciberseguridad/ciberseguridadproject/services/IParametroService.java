package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.services;

import java.util.List;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.Parametro;

public interface IParametroService {

    List<Parametro> findAll();


    Parametro save(Parametro Parametro);
    
}

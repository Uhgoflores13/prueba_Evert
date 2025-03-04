package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.Parametro;
import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.repositorie.IParametro;


@Service
public class ParametroService {

    @Autowired
    private IParametro repository;


    @Transactional
    public List<Parametro> findAll() {
        return repository.findAll();
    }

}

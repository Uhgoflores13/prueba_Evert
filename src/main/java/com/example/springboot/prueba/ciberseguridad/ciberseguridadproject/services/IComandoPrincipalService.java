package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.services;

import java.util.List;


import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.comandoPrincipal;

public interface IComandoPrincipalService {
    List<comandoPrincipal> findAll();

    comandoPrincipal save(comandoPrincipal ComandoPrincipal);
}

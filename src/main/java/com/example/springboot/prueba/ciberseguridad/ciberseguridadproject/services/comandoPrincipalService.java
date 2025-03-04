package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.comandoPrincipal;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.repositorie.IComandoPrincipal;

@Service
public class comandoPrincipalService implements IComandoPrincipalService {

    @Autowired
    private IComandoPrincipal repository;

    @Transactional
    public List<comandoPrincipal> findAll() {
        return repository.findAll();
    }

    @Transactional(rollbackFor = {DataIntegrityViolationException.class, Exception.class})
    public comandoPrincipal save(comandoPrincipal ComandoPrincipal) {
        return repository.save(ComandoPrincipal);
    }
}

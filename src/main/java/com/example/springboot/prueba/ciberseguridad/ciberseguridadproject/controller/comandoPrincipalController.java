package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestBody;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.services.IComandoPrincipalService;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.comandoPrincipal;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;


@RestController
@CrossOrigin("*")
@RequestMapping("/comandoPrincipal")
public class comandoPrincipalController {

    @Autowired
    private IComandoPrincipalService service;

    @GetMapping
    public List<comandoPrincipal> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<?> create (@RequestBody comandoPrincipal ComandoPrincipal){
        try{
            comandoPrincipal saveComando = service.save(ComandoPrincipal);
            return ResponseEntity.status(HttpStatus.CREATED).body(saveComando);
        }catch(DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("An error occurred while creating the user, User or Email are repeated");
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while creating the user");
        }
    }

}

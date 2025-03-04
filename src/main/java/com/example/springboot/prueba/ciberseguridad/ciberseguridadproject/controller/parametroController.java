package com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.models.entity.Parametro;

import com.example.springboot.prueba.ciberseguridad.ciberseguridadproject.repositorie.IParametro;

@RestController
@RequestMapping("/api")
public class parametroController {

    @Autowired
    private IParametro Iparametro;

    @GetMapping("/parametro")
    public List<String> getParametersList(@RequestParam("program")String programName){
       List<Parametro> parametros = Iparametro.findByComandoPrincipalNombre(programName);

       return parametros.stream().map(Parametro::getOpcion).toList();
    }
    
}

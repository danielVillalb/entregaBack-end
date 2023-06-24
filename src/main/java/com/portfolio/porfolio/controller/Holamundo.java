/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.controller;

import com.portfolio.porfolio.model.Persona;
import com.portfolio.porfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carlos
 */
@RestController
public class Holamundo {
    @GetMapping("traer")
    public String traer(){
        return "anda";
    }
    /*
    @Autowired
    public PersonaRepository persoRepo;
    @PostMapping("traer/perso")
    public List<Persona> traerPersonas(){
        List<Persona> listaPerso=persoRepo.findAll();
        return listaPerso;
    }*/
    
}

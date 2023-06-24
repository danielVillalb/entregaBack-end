/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Persona;
import com.portfolio.porfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class PersonaService implements IPersonaService{
    @Autowired
    public PersonaRepository persoRepo;
    @Override
    public void crearPersona(Persona perso) {
    persoRepo.save(perso);
    }

    @Override
    public List<Persona> traer() {
    List<Persona> listaPersona=persoRepo.findAll();
    return listaPersona;
    }

    @Override
    public Persona traerPersona(long id) {
     Persona perso=persoRepo.findById(id).orElse(null);
     return perso;
    }
    
}

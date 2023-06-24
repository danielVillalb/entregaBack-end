/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Proyectos;
import com.portfolio.porfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class ProyectoService implements IProyectoService{
       @Autowired
    private ProyectoRepository proRepository;

    @Override
    public List<Proyectos> traerProyectos() {
        List<Proyectos> listaProyect=proRepository.findAll();
        return listaProyect;
    }

    @Override
    public void crearProyecto(Proyectos proyect) {
        proRepository.save(proyect);
    }

    @Override
    public void borrarProyect(Long id) {
        proRepository.deleteById(id);
    }

    @Override
    public Proyectos traerProyId(Long id) {
        Proyectos proyect=proRepository.findById(id).orElse(null);
        return proyect;
    }

   
    
    
}

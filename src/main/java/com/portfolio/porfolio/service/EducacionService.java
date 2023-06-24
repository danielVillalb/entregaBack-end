/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Educacion;
import com.portfolio.porfolio.repository.EducacionReposiry;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class EducacionService implements IEducacionService{
    @Autowired
    public EducacionReposiry eduRepo;
    @Override
    public List<Educacion> traerEducacion() {
    List<Educacion> listaEducacion=eduRepo.findAll();
            return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion educ) {
    eduRepo.save(educ);
    }

    @Override
    public void borrarEducacion(long id) {
    eduRepo.deleteById(id);
    }

    @Override
    public Educacion traerEducacion(long id) {
    Educacion educ=eduRepo.findById(id).orElse(null);
    return educ;
    }

    
    
}

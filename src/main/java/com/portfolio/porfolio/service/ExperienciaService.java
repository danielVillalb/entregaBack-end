/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Experiencia;
import com.portfolio.porfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class ExperienciaService implements IExperienciaService{
     @Autowired
    private ExperienciaRepository expRepository;
    
    @Override
    public List<Experiencia> traerLista() {
    List<Experiencia> listaExp=expRepository.findAll();
            return listaExp;
    }

    @Override
    public void crearExp(Experiencia exp) {
        expRepository.save(exp);
    }

    @Override
    public void borrarExp(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public Experiencia traerExpId(Long id) {
    Experiencia exp=expRepository.findById(id).orElse(null);
    return exp;
    }
}

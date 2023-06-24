/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Persona;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface IPersonaService {
    public void crearPersona(Persona perso);
    public List<Persona> traer();
    public Persona traerPersona(long id);
}

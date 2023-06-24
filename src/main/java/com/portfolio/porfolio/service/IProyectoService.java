/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Proyectos;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface IProyectoService {
     public List<Proyectos> traerProyectos();
    public void crearProyecto(Proyectos proyect);
    public void borrarProyect(Long id);
    public Proyectos traerProyId(Long id);

}

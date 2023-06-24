/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface IEducacionService {
     ///traer personas
    public List<Educacion> traerEducacion();
    //dar de altas personas
    public void saveEducacion(Educacion educ);
    //borrar persona
    public void borrarEducacion(long id);
    //traer personas
    public Educacion traerEducacion(long id);
}

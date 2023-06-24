/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Experiencia;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface IExperienciaService {
    //traer lista de experiencias
    public List<Experiencia> traerLista();
    //crear experiencia
    public void crearExp(Experiencia exp);
    //borrar
    public void borrarExp(Long id);
    //traer con id
    public Experiencia traerExpId(Long id);
}

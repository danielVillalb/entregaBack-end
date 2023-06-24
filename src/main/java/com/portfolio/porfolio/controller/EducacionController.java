/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.controller;

import com.portfolio.porfolio.model.Educacion;
import com.portfolio.porfolio.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carlos
 */
@RestController
@CrossOrigin
public class EducacionController {
    @Autowired
    private IEducacionService eduService;
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/traer/educacion")
    public List<Educacion> traerEducacion(){
        List<Educacion> listaEduc=eduService.traerEducacion();
        return listaEduc;
    }
    //(origins="https://comienzo-7a284.web.app")
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/crear/educacion")
    public String crearEducacion(@RequestBody Educacion educ){
       eduService.saveEducacion(educ);
       return "Se creo la educcacion";
    }
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @PutMapping("/editar/educacion/{id}")
public Educacion actualizarEducacion(@PathVariable Long id,
                                  @RequestBody Educacion educacionActualizada) {
    Educacion edu= eduService.traerEducacion(id);
    if (educacionActualizada.getInstituto() != null) {
        edu.setInstituto(educacionActualizada.getInstituto());
    }
    if (educacionActualizada.getTitulo() != null) {
        edu.setTitulo(educacionActualizada.getTitulo());
    }
    if (educacionActualizada.getPeriodo() != null) {
        edu.setPeriodo(educacionActualizada.getPeriodo());
    }
    if(educacionActualizada.getTermino()!=null){
        edu.setTermino(educacionActualizada.getTermino());
    }
    
    
    eduService.saveEducacion(edu);
    return edu;
}
}

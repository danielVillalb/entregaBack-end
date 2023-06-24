/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.controller;

import com.portfolio.porfolio.model.Proyectos;
import com.portfolio.porfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class ProyectosController {
    @Autowired
    private IProyectoService proService;
    
    //traemos los proyectos
    @CrossOrigin
  
    @GetMapping("traer/proyectos")
    public List<Proyectos> traerProyect(){
        List<Proyectos> listaProyect=proService.traerProyectos();
        return listaProyect;
    }
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @GetMapping("traer/proyectos/id")
    public Proyectos traerProId(@RequestBody long id){
        Proyectos proyect=proService.traerProyId(id);
        return proyect;
    } 
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @DeleteMapping("borrar/proyectos/id")
    public String borrarProyectId(@RequestBody long id){
        proService.borrarProyect(id);
        return "Se borro con exito";
    }
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @PostMapping("crear/proyectos")
    public String crearPRoyect(@RequestBody Proyectos proyect){
        proService.crearProyecto(proyect);
        return "Se creo un proyecto nuevo";
    }
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @PutMapping("editar/proyectos/{id}")
    public String editarProyect(@PathVariable long id,@RequestBody Proyectos nuevoProyect){
        Proyectos viejoProyect=proService.traerProyId(id);        
        if(nuevoProyect.getNombre()!=null){
            viejoProyect.setNombre(nuevoProyect.getNombre());
        }
        if(nuevoProyect.getLink()!=null){
            viejoProyect.setLink(nuevoProyect.getLink());
        }
        if(nuevoProyect.getId()!=null){
            viejoProyect.setId(nuevoProyect.getId());
        }
        if(nuevoProyect.getImagen()!=null){
            viejoProyect.setImagen(nuevoProyect.getImagen());
        }
        if(nuevoProyect.getDescripcion()!=null){
            viejoProyect.setDescripcion(nuevoProyect.getDescripcion());
        }
        proService.crearProyecto(viejoProyect);
       return "Se edito correctamente";
    }
    
    
    
    
    
    
    
}


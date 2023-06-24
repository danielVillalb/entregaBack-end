/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.controller;

import com.portfolio.porfolio.model.Experiencia;
import com.portfolio.porfolio.service.IExperienciaService;
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
public class ExperienciaController {
    //@Autowired
    //private IPersonaService perService;
    @Autowired
    private IExperienciaService expService;
    //@CrossOrigin(origins="http://localhost:4200")
    @CrossOrigin
    @GetMapping("traer/exp")
    public List<Experiencia> traerExp(){
        List<Experiencia> listaExp=expService.traerLista();
        return listaExp;
    }
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @PostMapping("crear/exp")
    public String crearExp(@RequestBody Experiencia exp){
        

//resto de código para configurar la experiencia
//experienciaRepository.save(experiencia);
        expService.crearExp(exp);
        return "se creo con exito";
    }
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
     @PutMapping("/editar/experiencia/{id}")
public Experiencia actualizarExperiencia(@PathVariable Long id,
                                  @RequestBody Experiencia experienciaActualizada) {
    Experiencia exp= expService.traerExpId(id);
    if (experienciaActualizada.getEmpresa() != null) {
        exp.setEmpresa(experienciaActualizada.getEmpresa());
    }
    if (experienciaActualizada.getTrabajoActual() != null) {
        exp.setTrabajoActual(experienciaActualizada.getTrabajoActual());
    }
    if (experienciaActualizada.getFechainicio() != null) {
        exp.setFechainicio(experienciaActualizada.getFechainicio());
    }
    if(experienciaActualizada.getFechaFin()!=null){
        exp.setFechaFin(experienciaActualizada.getFechaFin());
    }
    if(experienciaActualizada.getDescripcion()!=null){
        exp.setDescripcion(experienciaActualizada.getDescripcion());
    }
    
    expService.crearExp(exp);
    return exp;
}
}

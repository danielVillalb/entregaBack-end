
package com.portfolio.porfolio.controller;

import com.portfolio.porfolio.model.Persona;
import com.portfolio.porfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class PersonaController {
    @Autowired
    public IPersonaService persoService;
    @CrossOrigin
    @GetMapping("traer/perso")
    public List<Persona> traer(){
        List<Persona> listaPersona=persoService.traer();
        return listaPersona;
    }
    @CrossOrigin
    @PostMapping("crear/perso")
    public String crearPerso(@RequestBody Persona perso){
        persoService.crearPersona(perso);
        return "Se creo persona";
    }
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    @PutMapping("/editar/persona/{id}")
public Persona actualizarPersona(@PathVariable Long id,
                                  @RequestBody Persona personaActualizada) {
    Persona perso= persoService.traerPersona(id);
    if (personaActualizada.getNombre() != null) {
        perso.setNombre(personaActualizada.getNombre());
    }
    if (personaActualizada.getApellido() != null) {
        perso.setApellido(personaActualizada.getApellido());
    }
    
    if(personaActualizada.getEmail()!=null){
        perso.setEmail(personaActualizada.getEmail());
    }
    if(personaActualizada.getSobreMi()!=null){
        perso.setSobreMi(personaActualizada.getSobreMi());
    }
    if(personaActualizada.getTelefono()!=null){
        perso.setTelefono(personaActualizada.getTelefono());
    }
    if(personaActualizada.getUrlImagen()!=null){
        perso.setUrlImagen(personaActualizada.getUrlImagen());
    }
    persoService.crearPersona(perso);
    return perso;
}
}

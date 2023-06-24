/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.controller;

import com.portfolio.porfolio.model.Usuario;
import com.portfolio.porfolio.service.IUsuarioService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
public class UsuarioController {
     @PersistenceContext
private EntityManager entityManager;
    @Autowired
    private IUsuarioService userService;
    @CrossOrigin
    //@CrossOrigin(origins="http://localhost:4200")
    //@CrossOrigin(origins="https://comienzo-7a284.web.app")
    @GetMapping("traer/users")
    public List<Usuario> traerUsers(){
        List<Usuario> listaUsuarios=userService.traerUsuarios();
        return listaUsuarios;
    }
    @CrossOrigin
    @PostMapping("crear/user")
    public String crearUser(@RequestBody Usuario user){
        
        userService.crearUser(user);
        return "Se creo correctamente";
        
    }
    //@CrossOrigin(origins="http://localhost:4200")
    @CrossOrigin
    @GetMapping("traer/user")
    public Usuario traerUserId(@RequestBody long id){
        Usuario user=userService.traerUserId(id);
        return user;
    }
    //@CrossOrigin(origins="http://localhost:4200")
    @CrossOrigin
    @GetMapping("borrar/user")
    public String borrarUserId(@RequestBody long id){
        userService.eliminarUser(id);
        entityManager.createNativeQuery("ALTER TABLE usuario AUTO_INCREMENT = 1").executeUpdate();
       return "Se borro adecuadamente";
    }
    //@CrossOrigin(origins="http://localhost:4200")
    @CrossOrigin
    @PutMapping("/editar/user/{id}")
public Usuario actualizarPersona(@PathVariable Long id,
                                  @RequestBody Usuario UsuarioActualizado) {
    Usuario user= userService.traerUserId(id);
    if (UsuarioActualizado.getUser() != null) {
        user.setUser(UsuarioActualizado.getUser());
    }
    if (UsuarioActualizado.getPassword() != null) {
        user.setPassword(UsuarioActualizado.getPassword());
    }
   
    userService.crearUser(user);
    return user;
}
//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin
@PostMapping("/usuario/valido/{id}")
    public Boolean verificar(@PathVariable long id,@RequestBody Usuario user){
        Usuario comprobar=userService.traerUserId(id);
        if ((comprobar.getPassword().equals( user.getPassword()))&&(comprobar.getUser().equals(user.getUser()))){
            return true;
        }else{
            return false;
        }
    }
}

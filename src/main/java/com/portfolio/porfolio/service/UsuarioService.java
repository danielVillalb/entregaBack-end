/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Usuario;
import com.portfolio.porfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class UsuarioService implements IUsuarioService{
     @Autowired
    private UsuarioRepository userRepository;

    @Override
    public List<Usuario> traerUsuarios() {
        List<Usuario> listaUser=userRepository.findAll();
        return listaUser;
    }

    @Override
    public void eliminarUser(long id) {
    userRepository.deleteById(id);
    }

    @Override
    public Usuario traerUserId(long id) {
    Usuario user=userRepository.findById(id).orElse(null);
    return user;
    }

    @Override
    public void crearUser(Usuario users) {
    userRepository.save(users);
    }
}

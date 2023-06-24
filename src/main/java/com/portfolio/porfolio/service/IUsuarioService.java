/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.porfolio.service;

import com.portfolio.porfolio.model.Usuario;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface IUsuarioService {
     public List<Usuario> traerUsuarios();
    public void eliminarUser(long id);
    public Usuario traerUserId(long id);
    public void crearUser(Usuario users);
}

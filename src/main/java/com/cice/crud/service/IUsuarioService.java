package com.cice.crud.service;

import com.cice.crud.service.impl.UsuarioService;

import java.util.List;

public interface IUsuarioService {

    void creaUsuario(String nombre, String user, String pass, String mail);

    String mostrarUsuarios();

    void actualizaUsuario(Long id, String campo, String dato);

    void borraUsuario(Long id);

}

package com.cice.crud.service.impl;

import com.cice.crud.data.repository.UsuarioRepository;
import com.cice.crud.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public void creaUsuario(String nombre, String user, String pass, String mail) {

    }

    @Override
    public String mostrarUsuarios() {
        return null;
    }

    @Override
    public void actualizaUsuario(Long id, String campo, String dato) {

    }

    @Override
    public void borraUsuario(Long id) {

    }
}
}

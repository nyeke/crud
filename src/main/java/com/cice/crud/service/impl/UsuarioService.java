package com.cice.crud.service.impl;

import com.cice.crud.data.entity.UsuarioEntity;
import com.cice.crud.data.repository.UsuarioRepository;
import com.cice.crud.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public String crea(String user, String pass) {
        String respuesta = null;
        return respuesta;
    }

    @Override
    public void lee(Long id) {

    }

    @Override
    public void actualiza(Long id, String pass) {

    }

    @Override
    public void borra(Long id) {

    }
}

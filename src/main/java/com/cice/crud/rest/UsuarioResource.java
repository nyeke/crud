package com.cice.crud.rest;

import com.cice.crud.data.entity.UsuarioEntity;
import com.cice.crud.service.IUsuarioService;
import com.cice.crud.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioResource {

    @Autowired
    private IUsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST, path = "/crea")
    public void creaUsuario(String nombre, String user, String pass, String mail){

    }

    @RequestMapping(method = RequestMethod.POST, path = "/lee")
    public String leeUsuario (){

        return usuarioService.mostrarUsuarios();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/actualiza")
    public void actualizaUsuario(Long id, String campo, String dato){

    }

    @RequestMapping(method = RequestMethod.POST, path = "/borra")
    public void borraUsuario(Long id){

    }

}

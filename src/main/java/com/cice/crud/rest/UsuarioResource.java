package com.cice.crud.rest;

import com.cice.crud.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioResource {

    @Autowired
    private IUsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST, path = "/crea")
    public void creaUsuario(String user, String pass){

    }

    @RequestMapping(method = RequestMethod.POST, path = "/lee")
    public String leeUsuario (Long id){

        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/actualiza")
    public void actualizaUsuario(Long id, String dato){

    }

    @RequestMapping(method = RequestMethod.POST, path = "/borra")
    public void borraUsuario(Long id){

    }

}

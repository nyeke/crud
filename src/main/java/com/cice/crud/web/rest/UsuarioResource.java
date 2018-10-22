package com.cice.crud.web.rest;

import com.cice.crud.service.IUsuarioService;
import com.cice.crud.web.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioResource {

    @Autowired
    private IUsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET)
    public List<UsuarioDTO> findAllUsers(){
        List<UsuarioDTO>listaUsuarios = null;
        listaUsuarios = usuarioService.findAllUsuarios();
        return listaUsuarios;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public UsuarioDTO findUserById (@PathVariable(name="id") Long id){
        UsuarioDTO usuarioDTO = null;
        Optional<UsuarioDTO> usuario = usuarioService.findUsuarioById(id);
        if(usuario.isPresent()){
            usuarioDTO = usuario.get();
        }
        return usuarioDTO;
    }

    @RequestMapping(method = RequestMethod.POST)
    public UsuarioDTO insertUser(@RequestBody UsuarioDTO usuarioDTO){
        UsuarioDTO usuario = null;
        return usuario;
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public UsuarioDTO updateUser(@PathVariable(name = "id") Long id, @RequestBody UsuarioDTO usuarioDTO){
        UsuarioDTO usuario = null;
        return usuario;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void deleteUser(@PathVariable(name = "id") Long id){

    }

}

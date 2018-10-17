package com.cice.crud.service;

import com.cice.crud.rest.UsuarioResource;
import com.cice.crud.service.impl.UsuarioService;

import java.util.Optional;

public interface IUsuarioService {

    List<> findAllUsuarios();

    Optional<> findUsuarioById(Long id);


}

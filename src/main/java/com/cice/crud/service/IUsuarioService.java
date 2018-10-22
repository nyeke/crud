package com.cice.crud.service;

import com.cice.crud.service.impl.UsuarioService;
import com.cice.crud.web.dto.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    List<UsuarioDTO> findAllUsuarios();

    Optional<UsuarioDTO> findUsuarioById(Long id);

    Long creaUsuario(UsuarioDTO usuario);

    Long eliminarUsuario(UsuarioDTO usuario);

}

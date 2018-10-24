package com.cice.crud.service.impl;

import com.cice.crud.data.entity.UsuarioEntity;
import com.cice.crud.data.repository.UsuarioRepository;
import com.cice.crud.service.IUsuarioService;
import com.cice.crud.service.converter.UsuarioConverter;
import com.cice.crud.web.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioConverter usuarioConverter;

    @Override
    public List<UsuarioDTO> findAllUsuarios(){
        List<UsuarioDTO> usuarioDTOList = null;

        usuarioDTOList = usuarioRepository
                .findAll()
                .stream()
                .map(entity -> usuarioConverter.UsuarioEntityToDTO(entity))
                .collect(Collectors.toList());
        return usuarioDTOList;
    }

    @Override
    public Optional<UsuarioDTO> findUsuarioById(Long id) {
        Optional<UsuarioDTO> usuarioDTOOptional = Optional.empty();
        Optional<UsuarioEntity> entityOptional = usuarioRepository.findById(id);
        if(entityOptional.isPresent()){
            usuarioDTOOptional= Optional.of(usuarioConverter.UsuarioEntityToDTO(entityOptional.get()));
        }
        return usuarioDTOOptional;
    }

    @Override
    public Long creaUsuario(UsuarioDTO usuario) {
        Long idUsuario = null;
        UsuarioEntity save = usuarioRepository.save(usuarioConverter.UsuarioDTOToEntity(usuario));
        idUsuario = save.getId();
        return idUsuario;
    }

    @Override
    public UsuarioDTO actualizarUsuario(UsuarioDTO usuario){
        UsuarioDTO usuarioResponse = null;
        Optional<UsuarioEntity> usuarioEntity = usuarioRepository.findById(usuario.getId());
        if(usuarioEntity.isPresent()) {
            usuarioConverter.matcherEntityDTO(usuario, usuarioEntity.get());
            usuarioRepository.save(usuarioEntity.get());
            usuarioResponse = usuarioConverter.UsuarioEntityToDTO(usuarioEntity.get());
        }
        return usuarioResponse;
    }

    @Override
    public Long eliminarUsuario(Long usuario) {

        usuarioRepository.deleteById(usuario);

        return usuario;
    }


}

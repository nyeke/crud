package com.cice.crud.service.converter;

import com.cice.crud.data.entity.UsuarioEntity;
import com.cice.crud.web.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public UsuarioDTO UsuarioEntityToDTO(UsuarioEntity usuarioEntity){
        UsuarioDTO usuarioDTO = null;

        usuarioDTO = new UsuarioDTO(
                usuarioEntity.getId(),
                usuarioEntity.getNombre(),
                usuarioEntity.getUser(),
                usuarioEntity.getMail()
        );

        return usuarioDTO;
    }

    public UsuarioEntity UsuarioDTOToEntity (UsuarioDTO usuarioDTO) {
        UsuarioEntity usuarioEntity = null;

        usuarioEntity = new UsuarioEntity(
                usuarioDTO.getId(),
                usuarioDTO.getNombre(),
                usuarioDTO.getUser(),
                usuarioDTO.getMail()
        );

        return usuarioEntity;
    }

    public void matcherEntityDTO(UsuarioDTO usuarioDTO, UsuarioEntity usuarioEntity){

        if (usuarioDTO.getNombre() == null && !usuarioDTO.getNombre().equals(usuarioEntity.getNombre())){
            usuarioEntity.setNombre(usuarioDTO.getNombre());
        }

        if (usuarioDTO.getMail() == null && !usuarioDTO.getMail().equals(usuarioEntity.getMail())){
            usuarioEntity.setMail(usuarioDTO.getMail());
        }

        if (usuarioDTO.getUser() == null && !usuarioDTO.getUser().equals(usuarioEntity.getUser())){
            usuarioEntity.setUser(usuarioDTO.getUser());
        }
    }
}

package com.cice.crud.data.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {

    @Column(name="id")
    private Long idUser;

    @Column(name="nombre")
    private String nombre;

    @Column(name="user")
    private String user;

    @Column(name="pass")
    private String pass;

    @Column(name="mail")
    private String mail;
}

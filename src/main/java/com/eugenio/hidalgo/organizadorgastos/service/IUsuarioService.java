package com.eugenio.hidalgo.organizadorgastos.service;

import com.eugenio.hidalgo.organizadorgastos.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> getAllUser();

    public  Usuario getUserById(int idUsuario);

}

package com.eugenio.hidalgo.organizadorgastos.service.impl;

import com.eugenio.hidalgo.organizadorgastos.dao.IUsuarioDAO;
import com.eugenio.hidalgo.organizadorgastos.model.Usuario;
import com.eugenio.hidalgo.organizadorgastos.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> getAllUser() {
        return (List<Usuario>) this.usuarioDAO.findAll();
    }

    @Override
    public Usuario getUserById(int idUsuario) {
        return this.usuarioDAO.findById(idUsuario).orElse(null);
    }

}

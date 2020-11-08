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

    /**
     *
     * @return Método que obtiene todos los usuarios
     */
    @Override
    public List<Usuario> getAllUser() {
        return (List<Usuario>) this.usuarioDAO.findAll();
    }

    /**
     *
     * @param idUsuario
     * @return Método que obtiene un usuario por id
     */
    @Override
    public Usuario getUserById(int idUsuario) {
        return this.usuarioDAO.findById(idUsuario).orElse(null);
    }

    /**
     *
     * @param usuario
     * @return Método que guarda un usuario
     */
    @Override
    public Usuario save(Usuario usuario) {
        return null;
    }

    /**
     *
     * @param usuario
     */
    @Override
    public void delete(Usuario usuario) {

    }

    /**
     * 
     * @param id
     */
    @Override
    public void deleteById(int id) {

    }

}

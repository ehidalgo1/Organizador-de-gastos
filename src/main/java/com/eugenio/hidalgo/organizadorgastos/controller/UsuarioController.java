package com.eugenio.hidalgo.organizadorgastos.controller;

import com.eugenio.hidalgo.organizadorgastos.model.Usuario;
import com.eugenio.hidalgo.organizadorgastos.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @GetMapping("/")
    public List<Usuario> getAll(){

        List<Usuario> listaUsers = new ArrayList<>();
        try {

            return listaUsers = this.iUsuarioService.getAllUser();


        }catch (Exception e){

            return listaUsers;

        }
    }

}

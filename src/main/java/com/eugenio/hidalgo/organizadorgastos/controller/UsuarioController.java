package com.eugenio.hidalgo.organizadorgastos.controller;

import com.eugenio.hidalgo.organizadorgastos.model.Usuario;
import com.eugenio.hidalgo.organizadorgastos.service.IMessageErrorService;
import com.eugenio.hidalgo.organizadorgastos.service.IUsuarioService;
import com.eugenio.hidalgo.organizadorgastos.service.impl.MessageErrorServiceImpl;
import com.eugenio.hidalgo.organizadorgastos.util.MessageError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;
    @Autowired
    private MessageErrorServiceImpl iMessageErrorService;

    @GetMapping("/")
    public List<Usuario> getAll(){

        List<Usuario> listaUsers = new ArrayList<>();
        try {
            return listaUsers = this.iUsuarioService.getAllUser();
        }catch (Exception e){
            return listaUsers;
        }
    }


    @GetMapping("/{idUsuario}")
    public ResponseEntity<?> getUsuario(@PathVariable int idUsuario){

        Usuario usuario = null;

        try {

            try{
                usuario = this.iUsuarioService.getUserById(idUsuario);
            }catch (DataAccessException e){
                return new ResponseEntity<DataAccessException>(e,HttpStatus.INTERNAL_SERVER_ERROR);
            }

            if (usuario!=null){
                return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
            }else {
                MessageError msgError = this.iMessageErrorService.userNotFound();
                return new ResponseEntity<MessageError>(msgError, HttpStatus.OK);
            }

        }catch (Exception e){
            return new ResponseEntity<Exception>(e,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody Usuario usuario){

        try {
            if(usuario!=null){



                return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
            }else {
                MessageError msgError = this.iMessageErrorService.userNotCreated();
                return new ResponseEntity<MessageError>(msgError,HttpStatus.BAD_REQUEST);
            }
        }catch ()

    }

}

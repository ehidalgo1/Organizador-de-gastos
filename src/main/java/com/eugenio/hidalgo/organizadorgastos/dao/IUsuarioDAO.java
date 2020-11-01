package com.eugenio.hidalgo.organizadorgastos.dao;

import com.eugenio.hidalgo.organizadorgastos.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDAO extends CrudRepository<Usuario,Integer> {

    @Query(value = "SELECT * FROM USUARIO WHERE RUT=:rut AND DV=:dv",nativeQuery = true)
    public Usuario findByRut(int rut,char dv);

}

package com.eugenio.hidalgo.organizadorgastos.service.impl;

import com.eugenio.hidalgo.organizadorgastos.model.Usuario;
import com.eugenio.hidalgo.organizadorgastos.service.IMessageErrorService;
import com.eugenio.hidalgo.organizadorgastos.util.Constantes;
import com.eugenio.hidalgo.organizadorgastos.util.MessageError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MessageErrorServiceImpl implements IMessageErrorService {

    Constantes constantes;

    /**
     *
     * @return Método que retorna mensaje cuando no se pudo encuentrar el usuario
     */
    @Override
    public MessageError userNotFound() {
        constantes = new Constantes();
        MessageError msgError = new MessageError();
        msgError.getTimestamp();
        msgError.setStatus(404);
        msgError.setError(constantes.USER_NOT_FOUND);

        return msgError;
    }

    /**
     *
     * @return Método que retorna mensaje cuando no se pudo crear el usuario
     */
    @Override
    public MessageError userNotCreated() {
        MessageError msgError = new MessageError();
        msgError.getTimestamp();
        msgError.setStatus(400);
        msgError.setError(constantes.USER_NOT_CREATED);

        return msgError;
    }
}

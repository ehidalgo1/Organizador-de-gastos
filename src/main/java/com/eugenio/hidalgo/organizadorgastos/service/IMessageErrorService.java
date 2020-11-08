package com.eugenio.hidalgo.organizadorgastos.service;

import com.eugenio.hidalgo.organizadorgastos.util.MessageError;

public interface IMessageErrorService {

    public MessageError userNotFound();

    public MessageError userNotCreated();

}

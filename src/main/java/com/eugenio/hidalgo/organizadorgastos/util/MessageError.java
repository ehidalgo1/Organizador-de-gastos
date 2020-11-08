package com.eugenio.hidalgo.organizadorgastos.util;

import java.util.Date;

public class MessageError {

    private Date timestamp;
    private int status;
    private String error;

    public Date getTimestamp() {
        return new Date();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

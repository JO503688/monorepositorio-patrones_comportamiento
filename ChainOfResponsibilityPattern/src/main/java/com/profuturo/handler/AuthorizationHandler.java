package com.profuturo.handler;

import com.profuturo.model.User;

public abstract class AuthorizationHandler {
    protected AuthorizationHandler next;

    // Método para establecer el siguiente manejador en la cadena
    public void setNextHandler(AuthorizationHandler next) {
        this.next = next;
    }

    // Método abstracto para manejar la autorización
    public abstract void handleAuthorization(User user);
}

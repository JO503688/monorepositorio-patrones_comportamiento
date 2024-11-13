package com.profuturo.handler;

import com.profuturo.model.Role;
import com.profuturo.model.User;

// Verifica si el usuario tiene el rol de USER
public class UserAuthorizationHandler extends AuthorizationHandler {
    @Override
    public void handleAuthorization(User user) {
        if (user.getRole() == Role.USER) {
            System.out.println(user.getUsername() + " tiene acceso como USER.");
        } else {
            System.out.println(user.getUsername() + " no tiene permisos. Fin de la cadena.");
        }
    }
}
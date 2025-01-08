package com.profuturo.handler;

import com.profuturo.model.Role;
import com.profuturo.model.User;

// Verifica si el usuario tiene el rol de MODERATOR
public class ModeratorAuthorizationHandler extends AuthorizationHandler {
    @Override
    public void handleAuthorization(User user) {
        if (user.getRole() == Role.MODERATOR) {
            System.out.println(user.getUsername() + " tiene acceso como MODERATOR.");
        } else {
            if (next != null) {
                next.handleAuthorization(user);
            }
        }
    }
}

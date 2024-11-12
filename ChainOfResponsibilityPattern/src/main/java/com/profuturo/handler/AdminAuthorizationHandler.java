package com.profuturo.handler;

import com.profuturo.model.Role;
import com.profuturo.model.User;

public class AdminAuthorizationHandler extends AuthorizationHandler {
    @Override
    public void handleAuthorization(User user) {
        if (user.getRole() == Role.ADMIN) {
            System.out.println(user.getUsername() + " tiene acceso como ADMIN.");
        } else {
            if (next != null) {
                next.handleAuthorization(user);
            }
        }
    }
}
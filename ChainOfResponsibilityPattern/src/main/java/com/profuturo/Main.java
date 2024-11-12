package com.profuturo;

import com.profuturo.handler.AdminAuthorizationHandler;
import com.profuturo.handler.AuthorizationHandler;
import com.profuturo.handler.ModeratorAuthorizationHandler;
import com.profuturo.handler.UserAuthorizationHandler;
import com.profuturo.model.Role;
import com.profuturo.model.User;

public class Main {
    public static void main(String[] args) {
        // Crear manejadores
        AuthorizationHandler adminHandler = new AdminAuthorizationHandler();
        AuthorizationHandler moderatorHandler = new ModeratorAuthorizationHandler();
        AuthorizationHandler userHandler = new UserAuthorizationHandler();

        // Configurar la cadena de responsabilidad
        adminHandler.setNextHandler(moderatorHandler);
        moderatorHandler.setNextHandler(userHandler);

        // Crear usuarios
        User user1 = new User("Alice", Role.ADMIN);
        User user2 = new User("Bob", Role.MODERATOR);
        User user3 = new User("Charlie", Role.USER);
        User user4 = new User("Dave", null);  // Un usuario sin acceso a roles

        // Enviar solicitudes a través de la cadena
        System.out.println("Autorización para Alice:");
        adminHandler.handleAuthorization(user1);

        System.out.println("\nAutorización para Bob:");
        adminHandler.handleAuthorization(user2);

        System.out.println("\nAutorización para Charlie:");
        adminHandler.handleAuthorization(user3);

        System.out.println("\nAutorización para Dave:");
        adminHandler.handleAuthorization(user4);
    }
}
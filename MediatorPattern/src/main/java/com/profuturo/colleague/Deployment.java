package com.profuturo.colleague;

import com.profuturo.mediator.ProjectMediator;

// Implementación de un colega que representa la fase de despliegue de un proyecto
public class Deployment extends ProjectModule {
    public Deployment(ProjectMediator mediator) {
        super(mediator);
    }

    public void startDeployment() {
        System.out.println("Deployment phase started.");
        // Simulación de despliegue...
        completeTask();
    }

    @Override
    public void completeTask() {
        System.out.println("Deployment phase completed.");
        mediator.notifyModule("Deployment", "completed");
    }
}
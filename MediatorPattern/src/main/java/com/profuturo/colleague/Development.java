package com.profuturo.colleague;

import com.profuturo.mediator.ProjectMediator;

// Implementación de un colega que representa la fase de desarrollo de un proyecto
public class Development extends ProjectModule {
    public Development(ProjectMediator mediator) {
        super(mediator);
    }

    public void startDevelopment() {
        System.out.println("Development phase started.");
        // Simulación de desarrollo...
        completeTask();
    }

    @Override
    public void completeTask() {
        System.out.println("Development phase completed.");
        mediator.notifyModule("Development", "completed");
    }
}

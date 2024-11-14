package com.profuturo.colleague;

import com.profuturo.mediator.ProjectMediator;

// Implementación de un colega que representa la fase de pruebas de un proyecto
public class Testing extends ProjectModule {
    public Testing(ProjectMediator mediator) {
        super(mediator);
    }

    public void startTesting() {
        System.out.println("Testing phase started.");
        // Simulación de pruebas...
        completeTask();
    }

    @Override
    public void completeTask() {
        System.out.println("Testing phase completed.");
        mediator.notifyModule("Testing", "completed");
    }
}
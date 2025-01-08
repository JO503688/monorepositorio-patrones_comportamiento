package com.profuturo.colleague;

import com.profuturo.mediator.ProjectMediator;

// Interfaz que define las acciones que pueden ejecutar los colegas
public abstract class ProjectModule {
    protected ProjectMediator mediator;

    protected ProjectModule(ProjectMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void completeTask();
}

package com.profuturo;

import com.profuturo.colleague.Deployment;
import com.profuturo.colleague.Development;
import com.profuturo.colleague.Testing;
import com.profuturo.mediator.ProjectMediatorImpl;

public class Main {
    public static void main(String[] args) {
        ProjectMediatorImpl mediator = new ProjectMediatorImpl();

        Development development = new Development(mediator);
        Testing testing = new Testing(mediator);
        Deployment deployment = new Deployment(mediator);

        mediator.setDevelopment(development);
        mediator.setTesting(testing);
        mediator.setDeployment(deployment);

        // Inicia el flujo de trabajo del proyecto
        development.startDevelopment();
    }
}
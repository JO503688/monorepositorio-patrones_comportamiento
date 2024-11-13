package com.profuturo.mediator;

import com.profuturo.colleague.Deployment;
import com.profuturo.colleague.Development;
import com.profuturo.colleague.Testing;

// Implementación concreta del mediador para coordinar la gestión de un proyecto
public class ProjectMediatorImpl implements ProjectMediator {
    private Development development;
    private Testing testing;
    private Deployment deployment;

    public void setDevelopment(Development development) {
        this.development = development;
    }

    public void setTesting(Testing testing) {
        this.testing = testing;
    }

    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
    }

    @Override
    public void notifyModule(String module, String event) {
        switch (module) {
            case "Development":
                if (event.equals("completed")) {
                    System.out.println("Development completed. Moving to Testing phase.");
                    testing.startTesting();
                }
                break;
            case "Testing":
                if (event.equals("completed")) {
                    System.out.println("Testing completed. Moving to Deployment phase.");
                    deployment.startDeployment();
                }
                break;
            case "Deployment":
                if (event.equals("completed")) {
                    System.out.println("Deployment completed. Project workflow finished.");
                }
                break;
            default:
                System.out.println("Unknown module or event.");
        }
    }
}

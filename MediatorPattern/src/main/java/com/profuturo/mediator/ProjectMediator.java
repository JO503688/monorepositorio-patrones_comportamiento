package com.profuturo.mediator;

// Interfaz que define los métodos de mediación para la coordinación de fases de un proyecto
public interface ProjectMediator {
    void notifyModule(String module, String event);
}

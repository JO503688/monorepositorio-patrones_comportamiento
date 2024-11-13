package com.profuturo.invoker;

import com.profuturo.command.Command;

// Invoker que almacena y ejecuta los comandos
public class RemoteControl {
    private Command command;

    // Asignar un comando al control remoto
    public void setCommand(Command command) {
        this.command = command;
    }

    // Ejecutar el comando asignado
    public void pressButton() {
        command.execute(); // Ejecuta el comando asignado
    }
}

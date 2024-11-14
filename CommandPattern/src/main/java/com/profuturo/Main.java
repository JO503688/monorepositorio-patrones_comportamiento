package com.profuturo;

import com.profuturo.command.Command;
import com.profuturo.command.TurnOffCommand;
import com.profuturo.command.TurnOnCommand;
import com.profuturo.invoker.RemoteControl;
import com.profuturo.receiver.Device;

// Cliente que configura el sistema
public class Main {
    public static void main(String[] args) {
        // Crear el receptor (el dispositivo)
        Device device = new Device();

        // Crear comandos para encender y apagar el dispositivo
        Command turnOnCommand = new TurnOnCommand(device);
        Command turnOffCommand = new TurnOffCommand(device);

        // Crear el invoker (control remoto)
        RemoteControl remoteControl = new RemoteControl();

        // Encender el dispositivo
        remoteControl.setCommand(turnOnCommand);
        System.out.println("Presionando el botón para encender:");
        remoteControl.pressButton();

        // Apagar el dispositivo
        remoteControl.setCommand(turnOffCommand);
        System.out.println("\nPresionando el botón para apagar:");
        remoteControl.pressButton();
    }
}
package com.profuturo.command;

import com.profuturo.receiver.Device;

// ConcreteCommand para encender el dispositivo
public class TurnOnCommand implements Command {
    private final Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn(); // Invoca la acción en el receptor
    }
}

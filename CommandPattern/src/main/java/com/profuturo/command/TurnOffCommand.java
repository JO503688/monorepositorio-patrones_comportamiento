package com.profuturo.command;

import com.profuturo.receiver.Device;

// ConcreteCommand para apagar el dispositivo
public class TurnOffCommand implements Command {
    private final Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff(); // Invoca la acción en el receptor
    }

}

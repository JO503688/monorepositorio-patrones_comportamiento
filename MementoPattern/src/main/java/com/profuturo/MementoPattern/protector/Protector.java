package com.profuturo.MementoPattern.protector;

import com.profuturo.MementoPattern.memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class Protector {
    private final List<Memento> record = new ArrayList<>();
    public void addMemento(Memento m) {
        record.add(m);
        System.out.println("Memento agregado al historial.");
    }

    public Memento getMemento() {
        // Devuelve el primer estado guardado
        return record.get(0);
    }
}

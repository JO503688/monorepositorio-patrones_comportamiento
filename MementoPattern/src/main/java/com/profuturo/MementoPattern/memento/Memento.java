package com.profuturo.MementoPattern.memento;

import com.profuturo.MementoPattern.originator.Originator;

public class Memento {
    private final String brand;
    private final String model;
    private final String price;

    public Memento(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Originator getEstado() {
        return new Originator(brand, model, price);
    }
}

package com.profuturo.MementoPattern.originator;

import com.profuturo.MementoPattern.memento.Memento;

public class Originator {
    private String brand;
    private String model;
    private String price;
    public Originator(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public Memento createMemento() {
        System.out.println("Creando memento del estado actual.");
        return new Memento(brand, model, price);
    }
    public void restoreState(Memento memento) {
        Originator previousState = memento.getEstado();
        this.brand = previousState.brand;
        this.model = previousState.model;
        this.price = previousState.price;
        System.out.println("Restaurado a estado anterior.");
    }
    public void showInfo() {
        System.out.println("El auto es marca: " + brand + ", modelo: " + model + ", y su precio es: " + price);
    }
    public void modInfo(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}

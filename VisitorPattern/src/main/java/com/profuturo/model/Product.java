package com.profuturo.model;

import com.profuturo.element.Exportable;
import com.profuturo.visitor.ExportVisitor;

// ConcreteElement Producto
public class Product implements Exportable {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ExportVisitor visitor) {
        visitor.visitProduct(this);
    }
}
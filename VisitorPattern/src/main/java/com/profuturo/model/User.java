package com.profuturo.model;

import com.profuturo.element.Exportable;
import com.profuturo.visitor.ExportVisitor;

// ConcreteElement Usuario
public class User implements Exportable {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ExportVisitor visitor) {
        visitor.visitUser(this);
    }
}
package com.profuturo.model;

public class Traspaso {
    private int idTraspaso;
    private String nombre;
    private String estatus;

    public Traspaso(int idTraspaso, String nombre, String estatus) {
        this.idTraspaso = idTraspaso;
        this.nombre = nombre;
        this.estatus = estatus;
    }

    // Getters
    public int getIdTraspaso() {
        return idTraspaso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstatus() {
        return estatus;
    }

    @Override
    public String toString() {
        return "Traspaso{id=" + idTraspaso + ", nombre='" + nombre + "', estatus='" + estatus + "'}";
    }
}

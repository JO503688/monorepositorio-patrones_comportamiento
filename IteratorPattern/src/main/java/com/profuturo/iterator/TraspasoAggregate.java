package com.profuturo.iterator;

import com.profuturo.model.Traspaso;

// Implementación de la interfaz Aggregate que contiene el arreglo de Traspaso
public class TraspasoAggregate implements Aggregate<Traspaso> {
    private Traspaso[] traspasos;

    public TraspasoAggregate(Traspaso[] traspasos) {
        this.traspasos = traspasos;
    }

    @Override
    public Iterator<Traspaso> createIterator() {
        return new TraspasoIterator(traspasos);
    }
}

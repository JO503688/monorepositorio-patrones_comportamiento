package com.profuturo.iterator;

import com.profuturo.model.Traspaso;

// Iterador concreto que implementa la interfaz Iterator para la colección de Traspaso
public class TraspasoIterator implements Iterator<Traspaso> {
    private Traspaso[] traspasos;
    private int position = 0;

    public TraspasoIterator(Traspaso[] traspasos) {
        this.traspasos = traspasos;
    }

    @Override
    public boolean hasNext() {
        return position < traspasos.length && traspasos[position] != null;
    }

    @Override
    public Traspaso next() {
        return hasNext() ? traspasos[position++] : null;
    }

    @Override
    public Traspaso currentItem() {
        return position < traspasos.length ? traspasos[position] : null;
    }
}
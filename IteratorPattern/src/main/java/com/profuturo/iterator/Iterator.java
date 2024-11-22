package com.profuturo.iterator;

// Interfaz Iterator con métodos estándar de iteración
public interface Iterator<T> {
    boolean hasNext();
    T next();
    T currentItem();
}
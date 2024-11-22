package com.profuturo.iterator;

// Interfaz Aggregate con un método para crear el iterador
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
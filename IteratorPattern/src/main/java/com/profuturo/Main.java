package com.profuturo;

import com.profuturo.iterator.Iterator;
import com.profuturo.iterator.TraspasoAggregate;
import com.profuturo.model.Traspaso;

public class Main {
    public static void main(String[] args) {
        // Crear una colección de Traspaso
        Traspaso[] traspasos = new Traspaso[] {
                new Traspaso(1, "Traspaso1", "Estatus1"),
                new Traspaso(2, "Traspaso2", "Estatus2"),
                new Traspaso(3, "Traspaso3", "Estatus3")
        };

        // Crear el agregador concreto
        TraspasoAggregate aggregate = new TraspasoAggregate(traspasos);

        // Obtener el iterador para recorrer la colección
        Iterator<Traspaso> iterator = aggregate.createIterator();

        // Recorrer y mostrar los elementos de Traspaso
        System.out.println("Recorriendo la colección de Traspaso:");
        while (iterator.hasNext()) {
            // Aquí se puede aplicar una serie de acciones sobre cada elemento
            System.out.println(iterator.next());
        }
    }
}
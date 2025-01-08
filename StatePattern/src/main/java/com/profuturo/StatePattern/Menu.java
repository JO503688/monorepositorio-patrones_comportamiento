package com.profuturo.StatePattern;

import java.util.Scanner;

public class Menu {
    Pet pet;

    public Menu(Pet pet){
        this.pet = pet;
    }

    public void display(){
        Scanner scannner = new Scanner(System.in);
        char option;
        String messageOptions = "Realizar accion: " + "a) alimentar, d) dormir, j) jugar, p) preguntar, s)salir";

        while (true){
            System.out.println(messageOptions);
            option = scannner.next().charAt(0);
            switch (option){
                case 'a': System.out.println("Pet: "); pet.feed(); break;
                case 'd': System.out.println("Pet: "); pet.sleep(); break;
                case 'j': System.out.println("Pet: "); pet.play(); break;
                case 'p': System.out.println("Pet: "); pet.howAreYou(); break;
                case 's': System.out.println("Hasta pronto! "); System.exit(0);
                default: System.out.println("Opcion no valida");
            }
        }
    }
}

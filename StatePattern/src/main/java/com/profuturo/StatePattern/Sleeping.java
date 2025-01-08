package com.profuturo.StatePattern;

import java.util.Timer;
import java.util.TimerTask;

public class Sleeping  implements State{
    private Pet pet;

    public Sleeping(){

    }
    @Override
    public void setPet(Pet pet) {
        this.pet = pet;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Sleeping.this.pet.setState(new Hungry());
            }
        }, 5000);
    }

    @Override
    public void feed() {
        System.out.println("...");
    }

    @Override
    public void play() {
        System.out.println("...");
    }

    @Override
    public void sleep() {
        System.out.println("Buenas noches!");
        pet.setState(new Sleeping());
    }

    @Override
    public void howAreYou() {
        System.out.println("...");
    }
}

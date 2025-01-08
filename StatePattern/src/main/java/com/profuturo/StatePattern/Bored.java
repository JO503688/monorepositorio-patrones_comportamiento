package com.profuturo.StatePattern;

public class Bored implements State{
    private Pet pet;

    @Override
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void feed() {
        System.out.println("No quiero comer");
    }

    @Override
    public void play() {
        System.out.println("Juguemos!!");
        pet.setState(new Tired());
    }

    @Override
    public void sleep() {
        System.out.println("No quiero dormir");
    }

    @Override
    public void howAreYou() {
        System.out.println("Estoy aburrido, quiero jugar");
    }
}

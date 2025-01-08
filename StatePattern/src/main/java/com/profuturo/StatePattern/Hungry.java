package com.profuturo.StatePattern;

public class Hungry implements State{
    private Pet pet;

    public Hungry(){

    }
    @Override
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void feed() {
        System.out.println("ñami ñami!!");
        pet.setState(new Bored());
    }

    @Override
    public void play() {
        System.out.println("No quiero jugar, tengo hambre");
    }

    @Override
    public void sleep() {
        System.out.println("No tengo sueño");
    }

    @Override
    public void howAreYou() {
        System.out.println("Tengo hambre, quiero comer");
    }
}

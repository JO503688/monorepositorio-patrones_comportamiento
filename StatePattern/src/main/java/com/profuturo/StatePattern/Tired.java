package com.profuturo.StatePattern;

public class Tired implements State{
    private Pet pet;

    public  Tired(){

    }
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
        System.out.println("No quiero jugar, estoy cansado");
    }

    @Override
    public void sleep() {
        System.out.println("Buenas noches!");
        pet.setState(new Sleeping());
    }

    @Override
    public void howAreYou() {
        System.out.println("Tengo sueño, quiero dormir");
    }
}

package com.profuturo.StatePattern;

public class Pet {
    private State state;

    public Pet(){
        setState(new Bored());
    }

    public void setState(State state){
        this.state = state;
        this.state.setPet(this);
    }

    public void feed(){
        this.state.feed();
    }

    public void sleep(){
        this.state.sleep();
    }

    public void play(){
        this.state.play();
    }

    public void howAreYou(){
        this.state.howAreYou();
    }
}

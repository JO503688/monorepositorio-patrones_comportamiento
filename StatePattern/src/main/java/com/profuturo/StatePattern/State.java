package com.profuturo.StatePattern;

public interface State {
    void setPet(Pet pet);
    void feed();
    void play();
    void sleep();
    void howAreYou();
}

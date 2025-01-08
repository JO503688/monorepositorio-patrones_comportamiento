package com.profuturo.ObserverPattern;

public interface Observable {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}

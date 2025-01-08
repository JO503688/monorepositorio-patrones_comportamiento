package com.profuturo.ObserverPattern;

public class Subscriber implements Observer{
    private YoutubeChannel observable;

    public Subscriber(YoutubeChannel observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("New video posted!");
        System.out.println("Latest video title: " + observable.getLastVideoTitle());
    }
}

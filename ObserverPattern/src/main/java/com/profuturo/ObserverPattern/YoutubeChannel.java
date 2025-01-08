package com.profuturo.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable{
    private List<Observer> channelSubscribers = new ArrayList<>();
    private String lastVideoPosted = "";

    @Override
    public void attach(Observer o) {
        channelSubscribers.add(o);
    }

    @Override
    public void detach(Observer o) {
        channelSubscribers.remove(o);
    }

    public void addNewVideo(String title) {
        this.lastVideoPosted = title;
        notifyObservers();
        System.out.println("New youtube video added to channel: " + title);
    }

    public String getLastVideoTitle() {
        return lastVideoPosted;
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : channelSubscribers) {
            subscriber.update();
        }
    }
}

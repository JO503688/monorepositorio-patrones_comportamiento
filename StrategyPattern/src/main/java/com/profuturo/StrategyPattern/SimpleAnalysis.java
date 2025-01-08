package com.profuturo.StrategyPattern;

public abstract class SimpleAnalysis implements IStrategy{
    public void analyze(){
        start();
        skipZip();
        stop();
    }
    abstract void start();
    abstract void skipZip();
    abstract void stop();
}

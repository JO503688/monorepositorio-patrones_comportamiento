package com.profuturo.StrategyPattern;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        this.strategy.analyze();
    }
}

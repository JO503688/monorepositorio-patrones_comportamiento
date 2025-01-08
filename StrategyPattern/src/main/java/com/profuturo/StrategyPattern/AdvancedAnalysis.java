package com.profuturo.StrategyPattern;

public  abstract class AdvancedAnalysis implements IStrategy {
    public void analyze(){
        start();
        analyzeMemory();
        analyzeKeyLoggers();
        analyzeRootKits();
        UnZip();
        stop();
    }

    abstract void start();
    abstract void analyzeMemory();
    abstract void analyzeKeyLoggers();
    abstract void analyzeRootKits();
    abstract void UnZip();
    abstract void stop();
}

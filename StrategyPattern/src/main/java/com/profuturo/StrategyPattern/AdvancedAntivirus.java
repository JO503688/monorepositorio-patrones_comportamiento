package com.profuturo.StrategyPattern;

public class AdvancedAntivirus extends AdvancedAnalysis{
    @Override
    void start() {
        System.out.println("Antivirus Avanzado - Análisis simple iniciado");
    }

    @Override
    void analyzeMemory() {
        try {
            System.out.println("Analizando Memoria RAM...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void analyzeKeyLoggers() {
        try {
            System.out.println("Analizando en busca de Keyloggers...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void analyzeRootKits() {
        try {
            System.out.println("Analizando en busca de RootKits...");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void UnZip() {
        try {
            System.out.println("Analizando archivos zip...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Antivirus Avanzado - Análisis simple finalizado");
    }
}

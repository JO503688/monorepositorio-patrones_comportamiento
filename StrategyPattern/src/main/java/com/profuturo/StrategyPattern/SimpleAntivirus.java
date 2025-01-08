package com.profuturo.StrategyPattern;

public class SimpleAntivirus extends SimpleAnalysis{
    @Override
    void start() {
        System.out.println("Antivirus Simple - Análisis simple iniciado");
    }

    @Override
    void skipZip() {
        try {
            System.out.println("Analizando...");
            Thread.sleep(2500);
            System.out.println("No se pudo analizar archivos con extensión '.zip'");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Antivirus Simple - Análisis simple finalizado");
    }
}

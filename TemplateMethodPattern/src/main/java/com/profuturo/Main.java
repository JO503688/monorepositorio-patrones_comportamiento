package com.profuturo;

import com.profuturo.formats.HTMLGenerator;
import com.profuturo.formats.PDFGenerator;
import com.profuturo.formats.TextGenerator;
import com.profuturo.template.DocumentGenerator;

public class Main {
    public static void main(String[] args) {
        DocumentGenerator pdfGenerator = new PDFGenerator();
        DocumentGenerator htmlGenerator = new HTMLGenerator();
        DocumentGenerator textGenerator = new TextGenerator();

        System.out.println("Generando informe en PDF:");
        pdfGenerator.generateDocument();

        System.out.println("\nGenerando informe en HTML:");
        htmlGenerator.generateDocument();
        
        System.out.println("\nGenerando informe en Texto Plano:");
        textGenerator.generateDocument();
    }
}
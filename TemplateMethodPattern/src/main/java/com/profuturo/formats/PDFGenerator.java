package com.profuturo.formats;

import com.profuturo.template.DocumentGenerator;

public class PDFGenerator extends DocumentGenerator {

    @Override
    protected void createHeader() {
        System.out.println("Generando encabezado en PDF...");
    }

    @Override
    protected void createBody() {
        System.out.println("Generando cuerpo del informe en PDF...");
    }

    @Override
    protected void createFooter() {
        System.out.println("Generando pie de página en PDF...");
    }
}

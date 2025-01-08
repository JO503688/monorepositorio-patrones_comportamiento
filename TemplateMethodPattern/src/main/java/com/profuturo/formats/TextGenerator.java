package com.profuturo.formats;

import com.profuturo.template.DocumentGenerator;

public class TextGenerator extends DocumentGenerator {

    @Override
    protected void createHeader() {
        System.out.println("Encabezado del Informe (Texto Plano)");
    }

    @Override
    protected void createBody() {
        System.out.println("Cuerpo del Informe (Texto Plano)");
    }

    @Override
    protected void createFooter() {
        System.out.println("Pie de página del Informe (Texto Plano)");
    }
}

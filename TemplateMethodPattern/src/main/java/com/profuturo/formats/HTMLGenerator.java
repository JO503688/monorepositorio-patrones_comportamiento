package com.profuturo.formats;

import com.profuturo.template.DocumentGenerator;

public class HTMLGenerator extends DocumentGenerator {

    @Override
    protected void createHeader() {
        System.out.println("<h1>Encabezado del Informe</h1>");
    }

    @Override
    protected void createBody() {
        System.out.println("<p>Este es el contenido principal del informe en HTML.</p>");
    }

    @Override
    protected void createFooter() {
        System.out.println("<footer>Pie de página en HTML</footer>");
    }
}

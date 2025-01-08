package com.profuturo.template;

public abstract class DocumentGenerator {
    public final void generateDocument() {
        createHeader();
        createBody();
        createFooter();
    }

    protected abstract void createHeader();
    protected abstract void createBody();
    protected abstract void createFooter();
}

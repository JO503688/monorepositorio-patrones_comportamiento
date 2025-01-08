package com.profuturo;

import com.profuturo.element.Exportable;
import com.profuturo.model.Product;
import com.profuturo.model.User;
import com.profuturo.visitor.ExportVisitor;
import com.profuturo.visitor.JsonExportVisitor;
import com.profuturo.visitor.XmlExportVisitor;

public class Main {
    public static void main(String[] args) {
        // Crear elementos
        Exportable user = new User(1, "Alice");
        Exportable product = new Product(101, "Laptop", 1200.00);

        // Crear visitantes para exportación en diferentes formatos
        ExportVisitor jsonVisitor = new JsonExportVisitor();
        ExportVisitor xmlVisitor = new XmlExportVisitor();

        // Exportar en JSON
        System.out.println("Exportando en JSON:");
        user.accept(jsonVisitor);
        product.accept(jsonVisitor);

        // Exportar en XML
        System.out.println("\nExportando en XML:");
        user.accept(xmlVisitor);
        product.accept(xmlVisitor);

    }
}
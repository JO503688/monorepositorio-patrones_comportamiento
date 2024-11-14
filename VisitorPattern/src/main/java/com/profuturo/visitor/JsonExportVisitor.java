package com.profuturo.visitor;

import com.profuturo.model.Product;
import com.profuturo.model.User;

// ConcreteVisitor para exportar en formato JSON
public class JsonExportVisitor implements ExportVisitor {
    @Override
    public void visitUser(User user) {
        System.out.println("{\"User\": {\"id\": " + user.getId() + ", \"name\": \"" + user.getName() + "\"}}");
    }

    @Override
    public void visitProduct(Product product) {
        System.out.println("{\"Product\": {\"id\": " + product.getId() + ", \"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + "}}");
    }
}


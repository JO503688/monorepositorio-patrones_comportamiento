package com.profuturo.visitor;

import com.profuturo.model.Product;
import com.profuturo.model.User;

// ConcreteVisitor para exportar en formato XML
public class XmlExportVisitor implements ExportVisitor {
    @Override
    public void visitUser(User user) {
        System.out.println("<User><id>" + user.getId() + "</id><name>" + user.getName() + "</name></User>");
    }

    @Override
    public void visitProduct(Product product) {
        System.out.println("<Product><id>" + product.getId() + "</id><name>" + product.getName() + "</name><price>" + product.getPrice() + "</price></Product>");
    }
}
package com.profuturo.visitor;

import com.profuturo.model.Product;
import com.profuturo.model.User;

// Interface Visitor
public interface ExportVisitor {
    void visitUser(User user);
    void visitProduct(Product product);
}

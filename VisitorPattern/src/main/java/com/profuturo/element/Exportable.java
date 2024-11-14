package com.profuturo.element;

import com.profuturo.visitor.ExportVisitor;

// Interface Element
public interface Exportable {
    void accept(ExportVisitor visitor);
}
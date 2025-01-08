package com.profuturo.expression;

// Clase concreta que representa los números en la expresión postfija
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

package com.profuturo;

import com.profuturo.context.InterpreterContext;

public class Main {
    public static void main(String[] args) {
        InterpreterContext context = new InterpreterContext();
        
        // Ejemplos de expresiones postfijas
        String expression1 = "3 4 +";  // 3 + 4 = 7
        String expression2 = "5 9 *";  // 5 * 9 = 45
        String expression3 = "8 2 /";  // 8 / 2 = 4
        String expression4 = "7 3 - 2 *";  // (7 - 3) * 2 = 8
        String expression5 = "9 3 1 - *";  // 9 * (3 - 1) = 18

        // Evaluar expresiones
        System.out.println("Resultado de '3 4 +': " + context.evaluate(expression1));
        System.out.println("Resultado de '5 9 *': " + context.evaluate(expression2));
        System.out.println("Resultado de '8 2 /': " + context.evaluate(expression3));
        System.out.println("Resultado de '7 3 - 2 *': " + context.evaluate(expression4));
        System.out.println("Resultado de '9 3 1 - *': " + context.evaluate(expression5));
    }
}
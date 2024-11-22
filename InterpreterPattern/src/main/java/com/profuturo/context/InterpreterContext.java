package com.profuturo.context;

import java.util.Stack;

import com.profuturo.expression.AdditionExpression;
import com.profuturo.expression.DivisionExpression;
import com.profuturo.expression.Expression;
import com.profuturo.expression.MultiplicationExpression;
import com.profuturo.expression.NumberExpression;
import com.profuturo.expression.SubtractionExpression;

public class InterpreterContext {
    private Stack<Expression> stack = new Stack<>();

    // Método para interpretar una expresión en notación postfija
    public int evaluate(String expression) {
        for (String token : expression.split(" ")) {
            if (isOperator(token)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = getOperator(token, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new NumberExpression(result));
            } else {
                Expression number = new NumberExpression(Integer.parseInt(token));
                stack.push(number);
            }
        }
        return stack.pop().interpret(); // El resultado final estará en la pila
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private Expression getOperator(String token, Expression left, Expression right) {
        return switch (token) {
            case "+" -> new AdditionExpression(left, right);
            case "-" -> new SubtractionExpression(left, right);
            case "*" -> new MultiplicationExpression(left, right);
            case "/" -> new DivisionExpression(left, right);
            default -> throw new IllegalArgumentException("Operador no soportado: " + token);
        };
    }
}

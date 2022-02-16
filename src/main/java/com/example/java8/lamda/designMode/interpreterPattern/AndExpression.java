package com.example.java8.lamda.designMode.interpreterPattern;


public class AndExpression implements Expression {
    private Expression expressionFirst;
    private Expression expressionSecond;
    public AndExpression(Expression expressionFirst, Expression expressionSecond) {
        this.expressionFirst = expressionFirst;
        this.expressionSecond = expressionSecond;
    }
    @Override
    public boolean interpret(String data) {
        return expressionFirst.interpret(data) && expressionSecond.interpret(data);
    }
}

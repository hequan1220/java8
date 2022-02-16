package com.example.java8.lamda.designMode.interpreterPattern;

public class InterPreterTest {
    public static void main(String[] args) {
        TerminalExpression terminalExpressionFirst = new TerminalExpression("java");
        TerminalExpression terminalExpressionSecond = new TerminalExpression("javase");
        AndExpression andExpression = new AndExpression(terminalExpressionFirst, terminalExpressionSecond);
        OrExpression orExpression = new OrExpression(terminalExpressionFirst, terminalExpressionSecond);
        System.out.println("andExpression:" + andExpression.interpret("java"));
        System.out.println("orExpression:" + orExpression.interpret("javase2"));

    }
}

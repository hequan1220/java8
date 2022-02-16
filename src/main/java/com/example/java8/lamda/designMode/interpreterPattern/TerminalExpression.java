package com.example.java8.lamda.designMode.interpreterPattern;

public class TerminalExpression implements Expression{
    private String data;
    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String data) {
        if(this.data.contains(data)){
            return true;
        }
        return false;
    }
}

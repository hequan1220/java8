package com.example.java8.lamda.designMode.strategy;

public class Context {
    public Strategy strategy;
    void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    int callStrategy(int num1,int num2){
        return strategy.compute(num1, num2);
    }
}

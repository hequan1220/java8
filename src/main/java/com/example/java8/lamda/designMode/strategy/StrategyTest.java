package com.example.java8.lamda.designMode.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();
        AddStrategy addStrategy = new AddStrategy();
        context.setStrategy(addStrategy);
        System.out.println("add:" + context.callStrategy(1, 2));
        DivideStrategy divideStrategy = new DivideStrategy();
        context.setStrategy(divideStrategy);
        context.callStrategy(1, 2);
        System.out.println("divide:" + context.callStrategy(1, 2));
    }
}

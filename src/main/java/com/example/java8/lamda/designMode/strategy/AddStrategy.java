package com.example.java8.lamda.designMode.strategy;

public class AddStrategy implements Strategy{
    @Override
    public int compute(int num1, int num2) {
        return num1 + num2;
    }
}

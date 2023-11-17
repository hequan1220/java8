package com.example.java8.lamda.exercise.designMode.modelMethod;

public class TestMain {
    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();
        template.templateMethod();
    }
}

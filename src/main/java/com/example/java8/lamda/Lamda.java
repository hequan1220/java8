package com.example.java8.lamda;

import java.util.function.Supplier;

public class Lamda {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 5;
        Integer integer = supplier.get();
        AddInterface addInterface = (a, b) -> a + b;
        Integer integer1 = addInterface.addValue(1, 2);
        ReduceInterface reduceInterface = (a, b) -> a - b;
        Integer integer2 = reduceInterface.reduceValue(1, 2);


    }

    interface AddInterface {
        Integer addValue(int a, int b);
    }

    interface ReduceInterface {
        Integer reduceValue(int a, int b);
    }

    class Model {

    }

    public class InnerClass {

    }

    abstract class abstractClass {

    }
}

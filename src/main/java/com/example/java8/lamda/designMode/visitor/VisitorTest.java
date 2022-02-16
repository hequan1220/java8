package com.example.java8.lamda.designMode.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerVisitorImpl());
    }
}

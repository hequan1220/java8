package com.example.java8.lamda.designMode.visitor;

public class ComputerVisitorImpl implements ComputerVisitor{
    @Override
    public void paly(Mouse mouse) {
        System.out.println("mouse play");
    }

    @Override
    public void paly(KeyBoard keyBoard) {
        System.out.println("keyBoard play");
    }

    @Override
    public void paly(Computer computer) {
        System.out.println("computer play");
    }
}

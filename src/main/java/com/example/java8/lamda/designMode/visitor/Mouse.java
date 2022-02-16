package com.example.java8.lamda.designMode.visitor;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.paly(this);
    }
}

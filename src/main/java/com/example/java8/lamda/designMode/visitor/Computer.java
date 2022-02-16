package com.example.java8.lamda.designMode.visitor;



public class Computer implements ComputerPart {
    ComputerPart[] computerParts;

    public Computer(){
        computerParts = new ComputerPart[]{new Mouse(), new KeyBoard()};
    }
    @Override
    public void accept(ComputerVisitor computerVisitor) {
        for (int i = 0; i <computerParts.length ; i++) {
            computerParts[i].accept(computerVisitor);
        }
        computerVisitor.paly(this);
    }
}

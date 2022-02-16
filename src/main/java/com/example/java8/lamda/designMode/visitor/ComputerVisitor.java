package com.example.java8.lamda.designMode.visitor;

public interface ComputerVisitor {
    void paly(Mouse mouse);
    void paly(KeyBoard keyBoard);
    void paly(Computer computer);
}

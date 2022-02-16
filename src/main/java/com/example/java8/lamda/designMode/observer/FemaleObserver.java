package com.example.java8.lamda.designMode.observer;

import java.util.Objects;

public class FemaleObserver extends Observer {
    public FemaleObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    void doSomething() {
        System.out.println(" female state:" + this.subject.getState());

    }
}

package com.example.java8.lamda.designMode.observer;

public class MaleObserver extends Observer{
    public MaleObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);

    }
    @Override
    void doSomething() {
        System.out.println(" male state:" + this.subject.getState());
    }
}

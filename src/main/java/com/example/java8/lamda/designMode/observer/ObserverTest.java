package com.example.java8.lamda.designMode.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        MaleObserver maleObserver = new MaleObserver(subject);
        FemaleObserver femaleObserver = new FemaleObserver(subject);
        subject.updateState(10);
        subject.updateState(90);
    }
}

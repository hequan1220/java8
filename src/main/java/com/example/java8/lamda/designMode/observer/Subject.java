package com.example.java8.lamda.designMode.observer;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;
@Data
public class Subject {
    List<Observer> observerList = Lists.newArrayList();
    private int state;
    void addObserver(Observer observer) {
        observerList.add(observer);
    }
    void updateState(int state){
        this.state = state;
        notifyObserver();
    }
    void notifyObserver(){
        for (Observer observer : observerList) {
            observer.doSomething();
        }
    }
}

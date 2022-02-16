package com.example.java8.lamda.designMode.statePattern;

import lombok.Data;

@Data
public class Context {
    private State state;
    void doAction(State state){
        this.state = state;
    }
}

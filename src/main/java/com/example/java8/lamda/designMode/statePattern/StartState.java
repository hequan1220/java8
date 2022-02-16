package com.example.java8.lamda.designMode.statePattern;

import lombok.Data;

@Data
public class StartState implements State{
    private String name = "start";
    @Override
    public void setToContext(Context context) {
        context.doAction(this);
    }
}

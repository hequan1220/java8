package com.example.java8.lamda.designMode.statePattern;

import lombok.Data;

@Data
public class StopState implements State{
    private String name = "stop";
    @Override
    public void setToContext(Context context) {
        context.doAction(this);
    }
}

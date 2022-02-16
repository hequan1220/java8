package com.example.java8.lamda.designMode.statePattern;

import com.alibaba.fastjson.JSONObject;

public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.setToContext(context);
        System.out.println("state:"+JSONObject.toJSONString(context.getState()));
        StopState stopState = new StopState();
        stopState.setToContext(context);
        System.out.println("state:"+JSONObject.toJSONString(context.getState()));

    }
}

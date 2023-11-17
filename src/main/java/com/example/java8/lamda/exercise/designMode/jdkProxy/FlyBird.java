package com.example.java8.lamda.exercise.designMode.jdkProxy;

public class FlyBird implements FlyService {
    @Override
    public String fly(String route) {
        System.out.println("Route: " + route);
        return route;
    }
}

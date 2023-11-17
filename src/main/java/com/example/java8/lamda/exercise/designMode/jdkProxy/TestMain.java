package com.example.java8.lamda.exercise.designMode.jdkProxy;

import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String[] args) {
        ClassLoader classLoader = FlyProxy.class.getClassLoader();
        Class<?>[] interfaces = FlyBird.class.getInterfaces();
        FlyBird flyBird = new FlyBird();
        FlyService flyService = (FlyService) Proxy.newProxyInstance(classLoader, interfaces, new FlyProxy(flyBird));
        flyService.fly("Go to pkslow.com");
    }
}

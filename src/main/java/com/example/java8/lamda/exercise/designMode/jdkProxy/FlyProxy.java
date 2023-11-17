package com.example.java8.lamda.exercise.designMode.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FlyProxy<T> implements InvocationHandler {
    private T target;
    public FlyProxy(T target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.nanoTime();
        System.out.println(target + ": ===JDK proxy===");
        Object result = method.invoke(this.target, args);
        System.out.println(target + ": ===JDK proxy===");
        long end = System.nanoTime();
        System.out.println("Executing time: " + (end - start) + " ns");
        return result;
    }
}

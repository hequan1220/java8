package com.example.java8.lamda.exercise.designMode.cglibProxy;

public class TestMain {
    public static void main(String[] args) {
        CglibProxy<Tree> cgLibProxy = new CglibProxy<>();
        Tree tree = cgLibProxy.getInstance(new Tree());
        tree.talk("Hi, pkslow");
    }
}

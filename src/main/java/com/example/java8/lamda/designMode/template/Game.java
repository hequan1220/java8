package com.example.java8.lamda.designMode.template;

public abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void end();
    void play(){
        initialize();
        start();
        end();
    }
}

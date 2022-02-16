package com.example.java8.lamda.designMode.builderPattern;

public abstract class Hamburger implements Item{
    public abstract Double getPrice() ;

    public abstract String getName();
    @Override
    public Pack getPack() {
        return new Wrapper();
    }
}

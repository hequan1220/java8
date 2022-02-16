package com.example.java8.lamda.designMode.builderPattern;

public class VegetableHamburger extends Hamburger{
    @Override
    public String getName() {
        return "我是蔬菜汉堡包";
    }

    @Override
    public Double getPrice() {
        return 10D;
    }

}

package com.example.java8.lamda.designMode.flyweight;

import lombok.Data;

@Data
public class Circle implements Shape{
    String color;

    @Override
    public void speak() {
        System.out.println("我是circle");
    }
}

package com.example.java8.lamda.designMode.prototypePattern;

import lombok.Data;

@Data
public class SquareShape extends Shape{
    @Override
    String draw() {
        return "画正方形喽";
    }
}

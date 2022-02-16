package com.example.java8.lamda.designMode.facadePattern;

public class FacadeTest {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker(new Circle(), new Square());
        shapeMaker.circleSpeak();
        shapeMaker.squareSpeak();
    }
}

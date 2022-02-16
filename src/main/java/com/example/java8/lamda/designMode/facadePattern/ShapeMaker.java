package com.example.java8.lamda.designMode.facadePattern;

public class ShapeMaker {
    private Shape shapeCircle;
    private Shape shapeSquare;
    public ShapeMaker(Shape shapeCircle, Shape shapeSquare) {
        this.shapeCircle = shapeCircle;
        this.shapeSquare = shapeSquare;
    }
    void circleSpeak(){
        shapeCircle.speak();
    }
    void squareSpeak(){
        shapeSquare.speak();
    }
}

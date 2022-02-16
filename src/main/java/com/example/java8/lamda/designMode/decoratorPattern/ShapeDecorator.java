package com.example.java8.lamda.designMode.decoratorPattern;

public abstract class ShapeDecorator {
    private Shape shape;
    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    public void strengthen() {
        shape.speak();
        System.out.println("执行了加强方法");
    }
}

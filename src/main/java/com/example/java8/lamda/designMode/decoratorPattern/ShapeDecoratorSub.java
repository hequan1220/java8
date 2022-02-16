package com.example.java8.lamda.designMode.decoratorPattern;

public class ShapeDecoratorSub extends ShapeDecorator {

    public ShapeDecoratorSub(Shape shape) {
        super(shape);
    }
    public void strongest(){
        strengthen();
        System.out.println("执行了最强方法");
    }
}

package com.example.java8.lamda.designMode.decoratorPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        ShapeDecoratorSub firstShapeDecorator = new ShapeDecoratorSub(new Circle());
        firstShapeDecorator.strongest();
        ShapeDecoratorSub secondShapeDecorator = new ShapeDecoratorSub(new Square());
        secondShapeDecorator.strongest();
    }
}

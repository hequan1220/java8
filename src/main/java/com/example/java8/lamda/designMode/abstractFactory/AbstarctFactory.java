package com.example.java8.lamda.designMode.abstractFactory;

public abstract class AbstarctFactory {
    public static final String blue="blue";
    public static final String red="red";
    public static final String circle="circle";
    public static final String square="square";


    abstract Color getColor(String colorType);

    abstract Shape getShape(String shapeType);

}

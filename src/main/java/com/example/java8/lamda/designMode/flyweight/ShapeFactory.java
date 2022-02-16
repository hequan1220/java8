package com.example.java8.lamda.designMode.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

public class ShapeFactory {
    public static Map<String,Shape> shapeMap = Maps.newHashMap();

    public static Shape getShape(String color) {
        Circle circle = (Circle) shapeMap.get(color);
        if (circle == null) {
            circle = new Circle();
            circle.setColor(color);
            shapeMap.put(color, circle);
        }
        return circle;
    }
}

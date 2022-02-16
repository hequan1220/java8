package com.example.java8.lamda.designMode.prototypePattern;

import com.google.common.collect.Maps;

import java.util.Map;

public class ShapeLoad {

    static Map<String, Shape> shapeMap = Maps.newHashMap();

    public static void loadShape() {
        CircleShape circleShape = new CircleShape();
        circleShape.setId("1");
        SquareShape squareShape = new SquareShape();
        squareShape.setId("2");
        shapeMap.put(circleShape.getId(), circleShape);
        shapeMap.put(squareShape.getId(), squareShape);
    }

    public static Shape getShape(String id) {
        Shape shape = shapeMap.get(id);
        return (Shape) shape.clone();
    }
    public static void main(String[] args) {
        ShapeLoad.loadShape();
        Shape shapeCircle = ShapeLoad.getShape("1");
        Shape shapeSquare = ShapeLoad.getShape("2");
        System.out.println("shapeCircle:"+ shapeCircle.draw());
        System.out.println("shapeSquare:"+ shapeSquare.draw());
    }
}

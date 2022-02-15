package com.example.java8.lamda.designMode.abstractFactory;

import org.apache.commons.lang3.StringUtils;

public class ShapeFactory extends AbstarctFactory{
    @Override
    Color getColor(String colorType) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(StringUtils.equals(shapeType,circle)){
            return new CircleShape();
        }else if(StringUtils.equals(shapeType,square)){
            return new SquareShape();
        }else {
            return null;
        }
    }
}

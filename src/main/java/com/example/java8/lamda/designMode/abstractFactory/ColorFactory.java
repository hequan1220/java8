package com.example.java8.lamda.designMode.abstractFactory;

import org.apache.commons.lang3.StringUtils;

public class ColorFactory extends AbstarctFactory{
    @Override
    Color getColor(String colorType) {
        if(StringUtils.equals(colorType,red)){
            return new RedColor();
        }else if(StringUtils.equals(colorType,blue)){
            return new BlueColor();
        }else {
            return null;
        }
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}

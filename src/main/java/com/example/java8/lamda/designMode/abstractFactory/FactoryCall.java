package com.example.java8.lamda.designMode.abstractFactory;

import org.apache.commons.lang3.StringUtils;
/***
 * @Author 贺权
 * @Description 抽象工厂模式
 * @Date 17:49 2022-02-15
 **/
public class FactoryCall {
    private static final String colorFactory="colorFactory";
    private static final String shapeFactory="shapeFactory";
    public static AbstarctFactory getAbsFactory(String param){
        if(StringUtils.equals(colorFactory,param)){
            return new ColorFactory();
        }else if(StringUtils.equals(shapeFactory,param)){
            return new ShapeFactory();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        AbstarctFactory colorFactoryAbs = FactoryCall.getAbsFactory(colorFactory);
        Color color = colorFactoryAbs.getColor(ColorFactory.red);
        color.draw();
        AbstarctFactory shapeFactoryAbs = FactoryCall.getAbsFactory(shapeFactory);
        Shape shape = shapeFactoryAbs.getShape(ShapeFactory.circle);
        shape.shapeName();
    }
}

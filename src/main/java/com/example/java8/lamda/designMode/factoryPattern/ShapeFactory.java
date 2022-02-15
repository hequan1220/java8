package com.example.java8.lamda.designMode.factoryPattern;


import org.apache.commons.lang3.StringUtils;
/***
 * @Author 贺权
 * @Description 工厂模式
 * @Date 17:24 2022-02-15
 **/
public class ShapeFactory {
    public static final String circle="circle";
    public static final String rectangle="rectangle";
    public static final String square="square";

    public Shape getShape(String shapeType) {
        if (StringUtils.isEmpty(shapeType)) {
            return null;
        }
        if (shapeType.equals(circle)) {
            return new Circle();
        } else if (shapeType.equals(rectangle)) {
            return new Rectangle();
        } else if (shapeType.equals(square)) {
            return new Square();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape(circle).shapeName();
        shapeFactory.getShape(rectangle).shapeName();
        shapeFactory.getShape(square).shapeName();
    }
}

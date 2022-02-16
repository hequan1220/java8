package com.example.java8.lamda.designMode.flyweight;

import com.alibaba.fastjson.JSONObject;


public class FlyweightTest {
    static String[] colors = {"red", "blue", "white"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle)ShapeFactory.getShape(getRandomIndex());
            System.out.println("circle:"+ JSONObject.toJSONString(circle));
        }
    }
    public static String getRandomIndex(){
        return colors[(int)(Math.random() * colors.length)];
    }
}

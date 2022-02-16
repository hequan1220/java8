package com.example.java8.lamda.designMode.template;

public class TemplateTest {
    public static void main(String[] args) {
        Game footBall = new FootBall();
        footBall.play();
        Game basketBall = new BasketBall();
        basketBall.play();
    }
}

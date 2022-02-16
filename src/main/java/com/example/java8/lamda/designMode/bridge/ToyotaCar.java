package com.example.java8.lamda.designMode.bridge;

public class ToyotaCar implements CarCompany{
    @Override
    public void drive() {
        System.out.println("丰田凯美瑞，去乡村兜风");
    }
}

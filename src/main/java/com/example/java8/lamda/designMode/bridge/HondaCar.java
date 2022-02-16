package com.example.java8.lamda.designMode.bridge;

public class HondaCar implements CarCompany {

    @Override
    public void drive() {
        System.out.println("本田雅阁，上高速兜风");
    }
}

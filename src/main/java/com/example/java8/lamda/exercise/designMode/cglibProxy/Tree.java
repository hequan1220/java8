package com.example.java8.lamda.exercise.designMode.cglibProxy;

import lombok.Data;

@Data
public class Tree {
    private String width;
    public String talk(String str) {
        System.out.println("Talking: " + str);
        return str;
    }
}

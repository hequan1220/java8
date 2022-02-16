package com.example.java8.lamda.designMode.iteratorPattern;

public class MyContainer implements Container {
    static String[] colors = {"red", "blue", "white", "black"};

    @Override
    public Iterator getIterator() {
        return new MyIterator();
    }
}

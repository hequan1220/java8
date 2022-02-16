package com.example.java8.lamda.designMode.iteratorPattern;

public class IteratorTest {
    public static void main(String[] args) {
        MyContainer myContainer = new MyContainer();
        Iterator iterator = myContainer.getIterator();
        while (iterator.hasNext(MyContainer.colors)) {
            System.out.println("颜色是：" + iterator.getNext(MyContainer.colors));
        }
    }
}

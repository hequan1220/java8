package com.example.java8.lamda.exercise.designMode.iterator;

public class TestMain {
    public static void main(String[] args) {
        IterableServiceImpl<String> collection = new IterableServiceImpl<>();
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");

        IteratorService<String> iteratorService = collection.createIterator();

        while (iteratorService.hasNext()) {
            System.out.println(iteratorService.next());
        }
    }
}

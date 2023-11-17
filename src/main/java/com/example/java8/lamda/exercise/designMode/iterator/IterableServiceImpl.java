package com.example.java8.lamda.exercise.designMode.iterator;

import java.util.ArrayList;
import java.util.List;


public class IterableServiceImpl<T> implements IterableService<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public IteratorService<T> createIterator() {
        return new IteratorServiceImpl<>(items);
    }
}

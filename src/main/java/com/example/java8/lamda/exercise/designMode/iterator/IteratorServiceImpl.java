package com.example.java8.lamda.exercise.designMode.iterator;

import java.util.List;

public class IteratorServiceImpl<T> implements IteratorService<T> {
    private List<T> items;
    private int position = 0;

    public IteratorServiceImpl(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            T item = items.get(position);
            position++;
            return item;
        }
        throw new IndexOutOfBoundsException("No more elements");
    }
}

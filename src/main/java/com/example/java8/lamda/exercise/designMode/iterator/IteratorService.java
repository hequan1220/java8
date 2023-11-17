package com.example.java8.lamda.exercise.designMode.iterator;

public interface IteratorService<T> {
    boolean hasNext();

    T next();
}

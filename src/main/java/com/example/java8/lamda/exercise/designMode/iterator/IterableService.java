package com.example.java8.lamda.exercise.designMode.iterator;


public interface IterableService<T> {
    IteratorService<T> createIterator();
}

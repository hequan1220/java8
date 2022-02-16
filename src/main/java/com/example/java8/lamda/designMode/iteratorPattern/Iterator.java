package com.example.java8.lamda.designMode.iteratorPattern;

import java.util.Objects;

public interface Iterator {
    boolean hasNext(String[] colors);

    Object getNext(String[] colors);
}

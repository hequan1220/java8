package com.example.java8.lamda.designMode.iteratorPattern;


public class MyIterator implements Iterator {
    int index;
    @Override
    public boolean hasNext(String[] colors) {
        if (index < colors.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object getNext(String[] colors) {
        return colors[index++];
    }
}

package com.example.java8.lamda.designMode.prototypePattern;

public abstract class Shape implements Cloneable{
    private String id;
    abstract String draw();
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

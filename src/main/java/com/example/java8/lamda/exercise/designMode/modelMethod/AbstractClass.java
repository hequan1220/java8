package com.example.java8.lamda.exercise.designMode.modelMethod;

abstract class AbstractClass {
    // 模板方法，定义算法的骨架
    public void templateMethod() {
        step1();
        step2();
        step3();
    }

    // 基本方法，子类需要实现
    abstract void step1();
    abstract void step2();
    abstract void step3();
}

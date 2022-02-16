package com.example.java8.lamda.designMode.chainOfResponsibility;

public class InfoLogger extends AbsLogger{
    public InfoLogger(int level){
        this.level = level;
    }
    @Override
    void writeMessageReal() {
        System.out.println("info 级别写消息");
    }
}

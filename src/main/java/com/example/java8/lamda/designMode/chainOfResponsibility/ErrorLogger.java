package com.example.java8.lamda.designMode.chainOfResponsibility;

public class ErrorLogger extends AbsLogger{
    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    void writeMessageReal() {
        System.out.println("error 级别写消息");
    }
}

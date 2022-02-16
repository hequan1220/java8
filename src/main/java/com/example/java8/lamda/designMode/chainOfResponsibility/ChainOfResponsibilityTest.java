package com.example.java8.lamda.designMode.chainOfResponsibility;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger(AbsLogger.WARN);
        InfoLogger infoLogger = new InfoLogger(AbsLogger.INFO);
        errorLogger.setNextLogger(infoLogger);
        errorLogger.writeMessage(AbsLogger.ERROR);

    }
}

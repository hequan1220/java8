package com.example.java8.lamda.designMode.chainOfResponsibility;


public abstract class AbsLogger {
    public static int INFO = 1;
    public static int WARN = 2;
    public static int ERROR = 3;
    protected int level;
    private AbsLogger nextLogger;
    public void setNextLogger(AbsLogger absLogger){
        this.nextLogger = absLogger;
    }
    void writeMessage(int level){
        if(this.level<level){
            writeMessageReal();
        }
        if (nextLogger != null) {
            nextLogger.writeMessage(level);
        }
    }
    abstract void writeMessageReal();

}

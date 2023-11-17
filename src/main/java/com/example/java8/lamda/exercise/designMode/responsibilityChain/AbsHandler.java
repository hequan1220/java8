package com.example.java8.lamda.exercise.designMode.responsibilityChain;

abstract class AbsHandler {
    protected AbsHandler successor;

    public void setSuccessor(AbsHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(ReimbursementRequest request);
}

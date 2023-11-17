package com.example.java8.lamda.exercise.designMode.responsibilityChain;

public class ReimbursementRequest {
    private double amount;
    private String description;

    public ReimbursementRequest(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}

package com.example.java8.lamda.exercise.designMode.responsibilityChain;

public class ManagerHandler extends AbsHandler{
    @Override
    public void handleRequest(ReimbursementRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("经理处理报销请求：" + request.getDescription());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

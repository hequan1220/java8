package com.example.java8.lamda.exercise.designMode.responsibilityChain;

public class DepartHandler extends AbsHandler{

    @Override
    public void handleRequest(ReimbursementRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("部门主管处理报销请求：" + request.getDescription());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

package com.example.java8.lamda.exercise.designMode.responsibilityChain;

public class FinanceHandler extends AbsHandler{

    @Override
    public void handleRequest(ReimbursementRequest request) {
        System.out.println("财务部门处理报销请求：" + request.getDescription());
    }
}

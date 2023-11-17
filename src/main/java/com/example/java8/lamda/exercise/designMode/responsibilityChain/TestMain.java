package com.example.java8.lamda.exercise.designMode.responsibilityChain;

public class TestMain {
    public static void main(String[] args) {
        AbsHandler manager = new ManagerHandler();
        AbsHandler department = new DepartHandler();
        AbsHandler finance = new FinanceHandler();

        manager.setSuccessor(department);
        department.setSuccessor(finance);

        ReimbursementRequest request1 = new ReimbursementRequest(800, "购买办公用品");
        ReimbursementRequest request2 = new ReimbursementRequest(3000, "参加培训");
        ReimbursementRequest request3 = new ReimbursementRequest(10000, "举办团建活动");

        manager.handleRequest(request1);
        manager.handleRequest(request2);
        manager.handleRequest(request3);
    }
}

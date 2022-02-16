package com.example.java8.lamda.designMode.commandPattern;

import com.google.common.collect.Lists;

import java.util.List;

public class MiddleMan {
    List<Order> orderList= Lists.newArrayList();

    void addOrder(Order order) {
        orderList.add(order);
    }
    void circleOrder(){
        for (int i = 0; i < orderList.size(); i++) {
            Order order = orderList.get(i);
            order.execute();
        }
    }
}

package com.example.java8.lamda.designMode.commandPattern;

public class CommandPatternTest {
    public static void main(String[] args) {
        MiddleMan middleMan = new MiddleMan();
        BuyOrder buyOrder = new BuyOrder(new Goods());
        SellOrder sellOrder = new SellOrder(new Goods());

        middleMan.addOrder(buyOrder);
        middleMan.addOrder(sellOrder);

        middleMan.circleOrder();

    }
}

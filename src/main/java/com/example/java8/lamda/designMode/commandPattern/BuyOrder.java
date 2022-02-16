package com.example.java8.lamda.designMode.commandPattern;

public class BuyOrder implements Order{
    private Goods goods;
    public BuyOrder(Goods goods){
        this.goods = goods;
    }
    @Override
    public void execute() {
        goods.bugGoods();
    }
}

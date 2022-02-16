package com.example.java8.lamda.designMode.commandPattern;

public class SellOrder implements Order{
    private Goods goods;
    public SellOrder(Goods goods){
        this.goods = goods;
    }

    @Override
    public void execute() {
        goods.sellGoods();
    }
}

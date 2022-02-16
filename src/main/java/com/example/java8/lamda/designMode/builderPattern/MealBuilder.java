package com.example.java8.lamda.designMode.builderPattern;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.List;

public class MealBuilder {
    static Meal getVegetableMeal(){
        List<Item> itemList = Lists.newArrayList();
        Item vegetableHamburger = new VegetableHamburger();
        Item pepsiCoke = new PepsiCoke();
        itemList.add(vegetableHamburger);
        itemList.add(pepsiCoke);
        return new Meal(itemList);
    }
    static Meal getNonVegetableMeal(){
        List<Item> itemList = Lists.newArrayList();
        Item chickenHamburger = new ChickenHamburger();
        Item cocaCola = new CocaCola();
        itemList.add(chickenHamburger);
        itemList.add(cocaCola);
        return new Meal(itemList);
    }
    public static void main(String[] args) {
        System.out.println("蔬菜套餐:" + JSON.toJSONString(getVegetableMeal()));
        System.out.println("鸡肉套餐:" + JSON.toJSONString(getNonVegetableMeal()));
    }
}

package com.example.java8.lamda.designMode.bridge;

import org.apache.commons.lang3.StringUtils;

public class RealDealer extends AbstractSecondDealer{
    private CarCompany carCompany;
    public static final String honda = "honda";
    public static final String toyota = "toyota";
    RealDealer(String type) {
        if (StringUtils.equals(honda, type)) {
            carCompany = new HondaCar();
        } else if (StringUtils.equals(toyota, type)) {
            carCompany = new ToyotaCar();
        }
    }
    @Override
    void testDrive() {
        carCompany.drive();
    }
}

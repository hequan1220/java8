package com.example.java8.lamda.designMode.bridge;

public class CarDemo {
    public static void main(String[] args) {
        RealDealer realDealerHonda = new RealDealer(RealDealer.honda);
        realDealerHonda.testDrive();
        RealDealer realDealerToyota = new RealDealer(RealDealer.toyota);
        realDealerToyota.testDrive();
    }
}

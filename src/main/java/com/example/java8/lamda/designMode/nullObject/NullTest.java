package com.example.java8.lamda.designMode.nullObject;

import org.apache.commons.lang3.StringUtils;

public class NullTest {
    private static String[] nameArray= {"summer","dance"};

    public static void main(String[] args) {
        System.out.println("customer:"+ getCustomer("summer").selectName());
        System.out.println("customer:"+ getCustomer("xxxx").selectName());
    }
    static Customer getCustomer(String name){
        for (int i = 0; i < nameArray.length; i++) {
            if (StringUtils.equals(name, nameArray[i])) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

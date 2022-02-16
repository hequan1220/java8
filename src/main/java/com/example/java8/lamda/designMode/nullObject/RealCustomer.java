package com.example.java8.lamda.designMode.nullObject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RealCustomer extends Customer{
    public RealCustomer(String name){
        this.name = name;
    }
    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String selectName() {
        return this.name;
    }
}

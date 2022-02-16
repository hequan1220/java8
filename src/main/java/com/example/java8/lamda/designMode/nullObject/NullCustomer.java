package com.example.java8.lamda.designMode.nullObject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NullCustomer extends Customer{
    public NullCustomer(String name){
        this.name = name;
    }
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String selectName() {
        return this.name;
    }
}

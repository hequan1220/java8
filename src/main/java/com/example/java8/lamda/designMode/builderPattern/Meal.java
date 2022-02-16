package com.example.java8.lamda.designMode.builderPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Meal {
    private List<Item> itemList;
}

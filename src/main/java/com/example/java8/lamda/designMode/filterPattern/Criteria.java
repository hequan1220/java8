package com.example.java8.lamda.designMode.filterPattern;

import java.util.List;

public interface Criteria {

    List<Person> dealFilter(List<Person> personList);
}

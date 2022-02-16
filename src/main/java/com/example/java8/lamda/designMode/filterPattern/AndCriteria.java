package com.example.java8.lamda.designMode.filterPattern;

import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> dealFilter(List<Person> personList) {
        List<Person> filterPersonList = firstCriteria.dealFilter(personList);
        return secondCriteria.dealFilter(filterPersonList);
    }
}

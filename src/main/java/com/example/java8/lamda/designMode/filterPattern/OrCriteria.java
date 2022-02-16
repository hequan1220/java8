package com.example.java8.lamda.designMode.filterPattern;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> dealFilter(List<Person> personList) {
        List<Person> firstFilterPersonList = firstCriteria.dealFilter(personList);
        List<Person> secondFilterPersonList = secondCriteria.dealFilter(personList);
        for (int i = 0; i < secondFilterPersonList.size(); i++) {
            if(!firstFilterPersonList.contains(secondFilterPersonList.get(i))){
                firstFilterPersonList.add(secondFilterPersonList.get(i));
            }
        }
        return firstFilterPersonList;
    }
}

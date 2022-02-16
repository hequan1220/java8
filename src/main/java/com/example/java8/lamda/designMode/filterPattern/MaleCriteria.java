package com.example.java8.lamda.designMode.filterPattern;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

public class MaleCriteria implements Criteria{
    @Override
    public List<Person> dealFilter(List<Person> personList) {
        if (!CollectionUtils.isEmpty(personList)) {
            return personList.stream().filter(person -> person.getSex().equals("male")).collect(Collectors.toList());
        }
        return Lists.newArrayList();
    }
}

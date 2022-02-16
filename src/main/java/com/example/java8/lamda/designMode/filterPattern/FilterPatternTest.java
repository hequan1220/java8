package com.example.java8.lamda.designMode.filterPattern;

import com.alibaba.fastjson.JSONArray;
import com.google.common.collect.Lists;
import java.util.List;

public class FilterPatternTest {
    public static void main(String[] args) {
        Person male = new Person(1, "10", "male");
        Person male1 = new Person(2, "20", "male");
        Person female = new Person(3, "30", "female");
        Person female1 = new Person(4, "40", "female");
        List<Person> personList = Lists.newArrayList();
        personList.add(male);
        personList.add(male1);
        personList.add(female);
        personList.add(female1);
        MaleCriteria maleCriteria = new MaleCriteria();
        System.out.println("male:"+ JSONArray.toJSONString(maleCriteria.dealFilter(personList)));
        FemaleCriteria femaleCriteria = new FemaleCriteria();
        System.out.println("female:"+ JSONArray.toJSONString(femaleCriteria.dealFilter(personList)));
        AndCriteria andCriteria = new AndCriteria(maleCriteria, femaleCriteria);
        System.out.println("male and female:"+ JSONArray.toJSONString(andCriteria.dealFilter(personList)));
        OrCriteria orCriteria = new OrCriteria(maleCriteria, femaleCriteria);
        System.out.println("male or femal:"+ JSONArray.toJSONString(orCriteria.dealFilter(personList)));
    }
}

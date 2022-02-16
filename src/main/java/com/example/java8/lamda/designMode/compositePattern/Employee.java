package com.example.java8.lamda.designMode.compositePattern;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int salary;
    private EmployeePosition position;
    private List<Employee> subordinateList;

    public Employee(String name, int salary, EmployeePosition position) {
        this.name=name;
        this.salary=salary;
        this.position=position;
        subordinateList = Lists.newArrayList();
    }
    public void addSubordinate(Employee employee) {
        subordinateList.add(employee);
    }
}

enum EmployeePosition{
    CEO,
    MANAGER,
    STAFF
}

package com.example.java8.lamda.designMode.compositePattern;

import com.alibaba.fastjson.JSONObject;

public class CompositeTest {
    public static void main(String[] args) {
        Employee firstEmployeeStaff = new Employee("一号员工", 1000, EmployeePosition.STAFF);
        Employee secondEmployeeStaff =new Employee("二号员工", 1000, EmployeePosition.STAFF);
        Employee employeeManager =new Employee("总经理", 10000, EmployeePosition.MANAGER);
        Employee employeeCEO = new Employee("大boss", 10000000, EmployeePosition.CEO);
        employeeCEO.addSubordinate(employeeManager);
        employeeManager.addSubordinate(firstEmployeeStaff);
        employeeManager.addSubordinate(secondEmployeeStaff);
        System.out.println(JSONObject.toJSONString(employeeCEO));
    }
}

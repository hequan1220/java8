package com.example.java8.lamda.designMode.mementoPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {
    private int state;
    Student getStudent(){
        return new Student(state);
    }
}

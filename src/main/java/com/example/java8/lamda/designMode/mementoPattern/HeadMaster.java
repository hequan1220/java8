package com.example.java8.lamda.designMode.mementoPattern;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HeadMaster {

    List<Student> studentList = Lists.newArrayList();
    void addStudent(Student student){
        studentList.add(student);
    }
}

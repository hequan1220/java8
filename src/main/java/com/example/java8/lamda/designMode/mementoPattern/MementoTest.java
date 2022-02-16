package com.example.java8.lamda.designMode.mementoPattern;

public class MementoTest {
    public static void main(String[] args) {
        HeadMaster headMaster = new HeadMaster();
        Teacher teacher = new Teacher(1);
        headMaster.addStudent(teacher.getStudent());
        teacher.setState(2);
        headMaster.addStudent(teacher.getStudent());
        for (Student student:headMaster.getStudentList()) {
            System.out.println("学生状态:" + student.getState());
        }
    }
}

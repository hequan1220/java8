package com.example.java8.lamda.myAnnotation;

public class AnnotationTest {
    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.builder().build();
        Class<? extends GirlFriend> girlFriendClass = girlFriend.getClass();
        if (girlFriendClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = girlFriendClass.getAnnotation(MyAnnotation.class);
            String name = annotation.name();
            System.out.println("name:" + name);
        }
    }
}

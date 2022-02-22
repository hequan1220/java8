package com.example.java8.lamda.myAnnotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
    String name() default "hello";
}

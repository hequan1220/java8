package com.example.java8.lamda.myAnnotation;

import lombok.Builder;
import lombok.Data;

@Data
@MyAnnotation(name = "marry")
@Builder
public class GirlFriend {
    private String address;
}

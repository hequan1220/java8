package com.example.java8.lamda.designMode.mediatorPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    public String name;
    void sendMessage(String message) {
        ChatRoom.sendMessage(message);
    }
}

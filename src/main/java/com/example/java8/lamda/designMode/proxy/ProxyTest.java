package com.example.java8.lamda.designMode.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage();
        proxyImage.proxyMethod();
        System.out.println("--------------------------------------------->>>>>>>");
        proxyImage.proxyMethod();

    }
}

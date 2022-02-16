package com.example.java8.lamda.designMode.proxy;

public class ProxyImage implements Image{
    private Image realImage;

    @Override
    public void display() {
        System.out.println("图片代理类");
    }
    void proxyMethod(){
        if (realImage == null) {
            realImage = new RealImage();
        }
        realImage.display();
        System.out.println("代理加强方法");
    }
}

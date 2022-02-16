package com.example.java8.lamda.designMode.proxy;

public class RealImage implements Image{
    public RealImage(){
        loadCache();
    }
    @Override
    public void display() {
        System.out.println("图片实现类");
    }
    public void loadCache(){
        System.out.println("图片实现类,加载点缓存");
    }
}

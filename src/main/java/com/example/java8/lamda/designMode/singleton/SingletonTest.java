package com.example.java8.lamda.designMode.singleton;
/***
 * @Author 贺权
 * @Description 单例模式
 * @Date 18:01 2022-02-15
 **/
public class SingletonTest {
    private static SingletonTest singletonTest = new SingletonTest();

    public static void main(String[] args) {
        SingletonTest singletonHungry = getSingletonHungry();
        System.out.println("singletonHungry:"+singletonHungry);
        SingletonTest singletonLazy = getSingletonLazy();
        System.out.println("singletonLazy:"+singletonLazy);

    }
    /***
     * @Author 贺权
     * @Description 懒汉式
     * @Date 18:01 2022-02-15
     * @param
     * @return com.example.java8.lamda.designMode.singleton.SingletonTest
     **/
    public static SingletonTest getSingletonLazy() {
        SingletonTest singletonTest = null;
        if (singletonTest == null) {
            synchronized (SingletonTest.class) {
                if (singletonTest == null) {
                    singletonTest = new SingletonTest();
                }
            }
        }
        return singletonTest;
    }
    /***
     * @Author 贺权
     * @Description 饿汉式
     * @Date 18:01 2022-02-15
     * @param
     * @return com.example.java8.lamda.designMode.singleton.SingletonTest
     **/
    public static SingletonTest getSingletonHungry() {
        return singletonTest;
    }
}

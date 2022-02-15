package com.example.java8.lamda;

public class InnerClassTest {
    public static void main(String[] args) {
        //1.成员内部类
        InnerClassTest innerClassTest = new InnerClassTest();
        innerClassTest.outerMethod();
        MemberInnerClass memberInnerClass = new InnerClassTest().new MemberInnerClass();
        memberInnerClass.doMethod();
        //2.局部内部类
        innerClassTest.getLocalInnerClass("获取局部内部类");
        //3.静态内部类
        InnerClassTest.StaticInnerClass.staticMethod("静态内部类，静态方法");
        StaticInnerClass staticClass = new StaticInnerClass();
        staticClass.noStaticMethod("静态内部类，非静态方法");
        //4.匿名内部类
        innerClassTest.callAnonymousMethod();
    }

    MemberInnerClass memberInnerClass = new MemberInnerClass();

    public void outerMethod() {
        memberInnerClass.doMethod();
    }

    public class MemberInnerClass {
        public MemberInnerClass() {

        }

        public void doMethod() {
            System.out.println("成员内部类");
        }
    }

    public OuterInterface getLocalInnerClass(String param) {
        class LocalInnerClass implements OuterInterface {
            public LocalInnerClass(String param) {
                System.out.println(param);
            }
        }
        return new LocalInnerClass(param);
    }

    static class StaticInnerClass {
        void noStaticMethod(String param) {
            System.out.println(param);
        }

        static void staticMethod(String param) {
            System.out.println(param);
        }
    }

    void callAnonymousMethod() {
        new AnonymousInterface() {
            public void anonymousMethod() {
                System.out.println("抓到匿名方法啦。。。。。。");
            }
        }.anonymousMethod();
    }

}

interface OuterInterface {
    default void methodDefault(){

    }
    default void methodDefault2(){

    }
    static void staticMethod(){

    }
    static void staticMethod2(){

    }
}

interface AnonymousInterface {

}

package com.example.java8.lamda;

import com.google.common.collect.Lists;
import lombok.Data;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lamda {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Lamda lamda = new Lamda();
        //1.lamda
        Supplier<Integer> supplier = () -> 5;
        Integer supplierValue = supplier.get();
        AddInterface addInterface = (a, b) -> a + b;
        Integer addValue = addInterface.addValue(1, 2);
        ReduceInterface reduceInterface = (a, b) -> a - b;
        Integer reduceValue = reduceInterface.reduceValue(1, 2);
        System.out.println("supplierValue:" + supplierValue);
        System.out.println("addValue:" + addValue);
        System.out.println("reduceValue:" + reduceValue);
        //2.方法引用
        List<String> stringList = Lists.newArrayList();
        stringList.add("一号技师");
        stringList.add("二号技师");
        stringList.forEach(System.out::println);
        BeautyModel beautyModel = BeautyModel.createMethod(BeautyModel::new);
        final List<BeautyModel> beautyModels = Arrays.asList(beautyModel);
        beautyModels.forEach(BeautyModel::method);
        beautyModels.forEach(BeautyModel::printName);
        //3.函数式接口
        //Supplier<T>
        Supplier<Integer> supplierInt = () -> 5;
        //Consumer<T>
        lamda.callConsume("测试函数式接口consumer", (param) -> consumeMethod(param));
        //BiConsumer<T,U>
        biConsumerMethod();
        //Function<T,R>
        Function<Integer, Integer> function = i -> i * 4;
        System.out.println("function:" + function.apply(10));
        //BiFunction<T,U,R>
        BiFunction<Integer, Integer, Integer> biFunction = (x1, x2) -> x1 + x2;
        System.out.println("BiFunction:" + biFunction.apply(10, 20));
        //Predicate<T>
        Predicate<Integer> predicate = i -> i > 1;
        System.out.println("predicate:" + predicate.test(10));

        //4.stream
        List<String> strList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> streamList = strList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        List<String> parallelStreamList = strList.parallelStream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("streamList:" + streamList + ",parallelStreamList:" + parallelStreamList);
        System.out.println("stream map:" + Arrays.asList(1, 2, 3).stream().map(num -> num + "号").collect(Collectors.toList()));
        //5.Optional
        Integer o1 = 0;
        Integer o2 = null;
        Optional<Integer> op1 = Optional.ofNullable(o2);
        Optional<Integer> op2 = Optional.of(o1);
        dealOptional(op1, op2);
        //日期时间 API
        System.out.println("当前时间：" + LocalDateTime.now());
        System.out.println("localTime: " + LocalTime.now());
        //BASE 64
        String encodeStr = Base64.getEncoder().encodeToString("幸福的小家庭".getBytes("utf-8"));
        String sourceStr = new String(Base64.getDecoder().decode(encodeStr), "utf-8");
        System.out.println("encodeStr:" + encodeStr + ",sourceStr:" + sourceStr);

    }

    public static void dealOptional(Optional<Integer> op1, Optional<Integer> op2) {
        System.out.println("op1:" + op1.isPresent());
        System.out.println("op2:" + op2.isPresent());
        System.out.println("op2 默认值:" + op1.orElse(100));
    }

    public static void consumeMethod(String param) {
        System.out.println("param:" + param);
    }

    public static void callConsume(String param, Consumer<String> consumer) {
        consumer.accept(param);
    }

    public static void biConsumerMethod() {
        StringBuilder stringAppend = new StringBuilder();
        BiConsumer<String, String> biConsumer =
                (str1, str2) -> {
                    stringAppend.append(str1);
                    stringAppend.append(str2);
                };
        biConsumer.accept("我是雅阁一号", ",我是吉利二号");
        System.out.println(stringAppend);
    }

    interface AddInterface {
        Integer addValue(int a, int b);
    }

    interface ReduceInterface {
        Integer reduceValue(int a, int b);
    }


}

@Data
class BeautyModel {
    private String name;
    private int age;

    public void method() {
        System.out.println("模特方法");
    }

    public static BeautyModel createMethod(Supplier<BeautyModel> supplier) {
        return supplier.get();
    }

    public static void printName(BeautyModel beautyModel) {
        System.out.println("模特姓名：" + beautyModel.getName());
    }
}
package com.java.study;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张三");
        list.add("周芷若");
        list.add("张翠山");

//        1、过滤方法
        list
                .stream()
                .filter(name -> name.startsWith("张") && name.length() == 3)
                .forEach(System.out::println);

        // 2、排序方法
        List<Double> scores = new ArrayList<> ();
        scores.add(90.0);
        scores.add(80.0);
        scores.add(100.0);
        scores.add(60.0);

        // 默认是升序
        scores.stream()
                .sorted()
                .forEach(System.out::println);

        // 降序
        scores.stream()
                .sorted((a, b) -> Double.compare(b, a))
                .forEach(System.out::println);
    }
}

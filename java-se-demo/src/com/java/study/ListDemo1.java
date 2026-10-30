package com.java.study;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("pear");
        list.add("orange");
        list.add("apple"); // 允许添加重复元素
        list.add(null); // 允许添加null元素
        System.out.println(list.size());
        System.out.println(list.contains("apple"));
        System.out.println(list.contains("banana"));
        System.out.println(list.indexOf("pear"));
        System.out.println(list.contains(new String("apple")));


        System.out.println("--------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("--------------------------------------");

        // 把List变为Array
        Object[] array = list.toArray();
        for (Object o: array) {
            System.out.println(o);
        }

//        Integer[] arr = list.toArray(Integer[]::new);

    }
}

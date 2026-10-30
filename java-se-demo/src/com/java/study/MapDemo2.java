package com.java.study;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 90);
        map.put("李四", 80);
        map.put("王五", 70);
        for (String key: map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }

//        直接使用forEach方法完成遍历
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}

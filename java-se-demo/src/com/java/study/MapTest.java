package com.java.study;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        // 创建一个集合
        List<String> locations = new ArrayList<>();
        // 定义一个数组
        String[] names = {"天安门", "东方明珠塔", "上海迪士尼", "珠海长隆"};
        Map<String, Integer> map = new HashMap<>();

        Random random = new Random();
        for (int i = 1; i <= 80; i++) {
            int index = random.nextInt(names.length); // 生成 [0, bound) 的随机整数，包含 0，不包含 bound
            locations.add(names[index]);
        }

        for (String location: locations) {
            if (map.containsKey(location)) {
                map.put(location, map.get(location) + 1);
            } else {
                map.put(location, 1);
            }
        }

        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}

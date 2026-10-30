package com.java.study;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        StudentScore s = new StudentScore("张三", 90);
        Map<String, StudentScore> map = new HashMap<>();
        map.put("张三", s);

        StudentScore target = map.get("张三");
        System.out.println( target == s); // true，同一个实例
        System.out.println(target.getScore()); // 90

        StudentScore another = map.get("李四"); // 通过另一个key查找
        System.out.println(another); // 未找到返回null
    }
}

class StudentScore {
    private String name;
    private int score;

    public StudentScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
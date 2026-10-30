package com.java.review.calculate;

public class ContinueDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("begin i=" + i);
            if (i % 2 == 0) {
                continue; // 跳过本轮循环，继续执行下一轮
            }
            sum += i;
            System.out.println("end i =" + i);
        }
        System.out.println(sum);
    }
}

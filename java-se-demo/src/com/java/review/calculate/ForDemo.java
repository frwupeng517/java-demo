package com.java.review.calculate;

public class ForDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        demo3();
    }

    /**
     * 给定一个数组，请用for循环倒序输出每一个元素
     */
    public static void demo1() {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i = ns.length - 1; i >= 0; i -=1) {
            System.out.println(ns[i]);
        }
    }

    /**
     * 利用for each循环对数组每个元素求和
     */
    public static void demo2() {
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int n : ns) {
            sum += n;
        }
        System.out.println(sum);
    }

    /**
     * 圆周率π可以使用公式计算：
     * 请利用for循环计算π
     */
    public static void demo3() {
        double pi = 0;
        double sign = 1.0; // 用于控制正负号，初始为正
        for (int i = 1; i <= 100000; i+= 2) {
            pi += sign * (1.0 / i);
            sign = -sign;
        }

        pi = pi * 4;
        System.out.println(pi); // 3.1415726535897814
    }
}

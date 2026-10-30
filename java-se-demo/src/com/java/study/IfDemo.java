package com.java.study;

import java.util.Arrays;

public class IfDemo {
    public static void main(String[] args) {
        int[] ns = {5, 2, 8, 1, 9};
        System.out.println(Arrays.toString(ns));
        // 升序
        for (int i = 0; i < ns.length - 1; i++) {
            System.out.println("------------第" + (i) + "轮排序------------");
            for (int j = 0; j < ns.length - 1 - i; j++) {
                System.out.println("比较" + ns[j] + "和" + ns[j + 1]);
                if (ns[j] > ns[j + 1]) {
                    int temp = ns[j];
                    System.out.println(temp);
                    ns[j] = ns[j + 1];
                    ns[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
        int[] ns2 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns2);
        System.out.println(Arrays.toString(ns2));

    }
}

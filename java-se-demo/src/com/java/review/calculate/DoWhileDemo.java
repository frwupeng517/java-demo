package com.java.review.calculate;

public class DoWhileDemo {
    public static void main(String[] args) {
        // while循环和do while循环主要是体现在第一次执行的区别上，如果同样的判断条件，
        // 就算不满足，do while也会强行执行一次，而while循环不会执行
        int sum = 0;
        int m = 200;
        int n = 100;

        do {
            sum += m;
            m++;
        } while (m <= n);
        System.out.println(sum);
    }
}

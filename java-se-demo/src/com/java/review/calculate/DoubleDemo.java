package com.java.review.calculate;

public class DoubleDemo {
    public static void main(String[] args) {
//        doubleCal1();
        doubleCal2();
    }

    /**
     * 浮点数运算误差
     */
    public static void doubleCal1 () {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;

        // 观察x和y是否相等
        System.out.println("x=" + x); // x=0.1
        System.out.println("y=" + y); // y=0.09999999999999998

        // 由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。
        // 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数

        // 比较x和y是否相等，先计算其差的绝对值
        double r = Math.abs(x - y);
        // 再判断绝对值是否足够小
        if (r < 0.00001) {
            // 可以认为相等
            System.out.println("x 等于 y"); // x 等于 y
        } else {
            System.out.println("x 不等于 y");
        }
    }

    /**
     * 强制转型
     */
    public static void doubleCal2() {
        // 可以将浮点数强制转型成整数，在转型时，浮点数的小数部分会被丢掉
        int n1 = (int) 12.9;
        System.out.println("n1 = " + n1); // n1 = 12

        // 如果要进行四舍五入，可以对浮点数加上 0.5 再强制转型
        int n2 = (int) (12.9 + 0.5);
        int n3 = (int) (12.4 + 0.5);
        System.out.println("n2 = " + n2); // n2 = 13
        System.out.println("n3 = " + n3); // n3 = 12
    }
}

package com.java.review.variable;

public class StringDemo {
    public static void main(String[] args) {
        demo2();
    }

    /**
     * 字符串不可变
     */
    public static void demo1() {
        String s = "hello";
        String t = s;
        s = "world";

        System.out.println(t); // hello
    }

    /**
     * 请将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串
     */
    public static void demo2() {
        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;

        String s = "" + (char) a  + (char) b + (char) c; // Hi！
        System.out.println(s);
    }
}

package com.java.review.variable;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"? ---> XYZ
    }

    /**
     * 定义数组：
     * 数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
     * 数组一旦创建后，大小就不可改变。
     */
    public static void createArray() {
        // 方式一
        int[] ns = new int[3];

        ns[0] = 89;
        ns[1] = 95;
        ns[2] = 98;

        // 方式二
        int[] nc = new int[] {89, 95, 98};

        // 方式三
        int[] nk = {89, 95, 98};
    }

}

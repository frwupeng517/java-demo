package com.java.study.file;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 目标：写程序实现字符编码和解码
        // 1、编码
        String str = "我爱你China7-1";

        byte[] bytes = str.getBytes(); // 默认使用平台指定的UTF-8编码
        byte[] gbks = str.getBytes("GBK");
        System.out.println(bytes.length); // 17，一个中文字符占3个字节
        System.out.println(Arrays.toString(bytes));
        // [-26, -120, -111, -25, -120, -79, -28, -67, -96, 67, 104, 105, 110, 97, 55, 45, 49]

        System.out.println("=============================");

        System.out.println(gbks);

        System.out.println("=============================");

        // 2、解码
        String s = new String(bytes); // 平台的UTF-8解码的
        String gbk = new String(bytes, "GBK"); // 指定GBK进行解码

        System.out.println(s); // 我爱你China7-1
        System.out.println(gbk); // 鎴戠埍浣燙hina7-1
    }
}

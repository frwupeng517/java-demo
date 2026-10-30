package com.java.study.demo8filewriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriteDemo {
    public static void main(String[] args) {
        // 目标：搞清楚文件字符输出流的使用：写字符出去的流
        try (
                // 1、创建一个字符输出流对象，指定写出目的地
                Writer fw = new FileWriter("java-se-demo\\src\\info-write.txt");
        ) {
            // 2、写一个字符出去
            fw.write('a');
            fw.write(98);
            fw.write('好');
            fw.write("\r\n"); // 换行

            // 3、写一个字符串出去
            fw.write("hello world");
            fw.write("你好");
            fw.write("\r\n");

            // 4、写字符串的一部分出去
            fw.write("hello world", 0, 5);
            fw.write("\r\n");

            // 5、写一个字符串数组出去
            String[] strArray = {"hello", "world", "java"};
            for (String str : strArray) {
                fw.write(str);
                fw.write("\r\n");
            }

            // 6、写一个字符数组的一部分出去
            char[] charArray = "hello world".toCharArray();
            fw.write(charArray, 0, 5);
            fw.write("\r\n");

            fw.flush(); // 刷新缓冲区，将缓冲区中的数据全部写出去
            // 刷新后，流可以继续使用
            // fw.close(); // 关闭流
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

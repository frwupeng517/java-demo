package com.java.study.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        System.out.println("开始");
        // 目标：掌握文件字节输入流读取文件中的字节数组到内存中来
        // 1、创建文件字节输入流管道与源文件接通
        FileInputStream fis = new FileInputStream("java-se-demo\\src\\info.txt");

        // 2、开始读取文件中的字节并输出，每次读取一个字节
        // 定义一个变量记住每次读取的一个字节
        int b;
        while ((b = fis.read()) != -1) {
            // 每次读取一个字节，性能较差，读取汉字输出会乱码
            System.out.println((char) b); // 110æ½
        }

        // 3、关闭流
        fis.close();
    }
}

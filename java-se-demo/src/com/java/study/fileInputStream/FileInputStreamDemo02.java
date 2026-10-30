package com.java.study.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流读取文件中的字节数组到内存中
        // 1、创建文件字节输入流管道与源文件接通
        FileInputStream fis = new FileInputStream("java-se-demo\\src\\info.txt");

        // 2、开始读取文件中的字节并输出，每次读取多个字节
        // 定义一个字节数组用于每次读取字节
        byte[] bytes = new byte[3];

        // 定义一个变量记住每次读取了多少个字节
        int len;
        while ((len = fis.read(bytes)) != -1) {
            // 3、把读取到的字节数组转换成字符串输出，读取多少写入多少到内存中
            String s = new String(bytes, 0, len);
            System.out.print(s);
        }

        fis.close();

        // 这种方式每次能读取多个字节，性能得到提升，因为每次读取多个字节，可以减少硬盘和内存的交互次数，从而提升性能
        // 依然无法避免读取汉字输出乱码的问题
        // 存在截断汉字字节的可能性
    }
}

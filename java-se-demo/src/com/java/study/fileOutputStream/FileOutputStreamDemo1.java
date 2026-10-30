package com.java.study.fileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 目标：学会使用文件字节输出流
        // 1、创建文件字节输出流管道与目标文件连通
//        OutputStream fos = new FileOutputStream("java-se-demo\\src\\info-output.txt"); // 覆盖管道
        OutputStream fos = new FileOutputStream("java-se-demo\\src\\info-output.txt", true); // 追加管道

        // 2、写入数据
        fos.write(97); // 写入一个字节数据
        fos.write('b'); // 写入一个字符数据
        fos.write("中".getBytes()); // 写入一个字符数据，会乱码
        fos.write("\r\n".getBytes()); // 换行

        // 3、写一个字节数组出去
        byte[] bytes = "我爱你中国168".getBytes();
        fos.write(bytes);
        fos.write("\r\n".getBytes());

        fos.close(); // 关闭管道 释放资源
    }
}

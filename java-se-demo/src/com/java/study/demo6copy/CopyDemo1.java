package com.java.study.demo6copy;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {
        // 目标：使用字节流完成文件的复制操作
        try {
            copyFile("java-se-demo\\src\\info.txt", "java-se-demo\\src\\info-output.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath) throws Exception {
        // 1、创建一个文件字节输出流管道与原文件接通
        InputStream fis = new FileInputStream(srcPath);
        OutputStream fos = new FileOutputStream(destPath);

        // 2、读取一个字节数组，写入一个字节数组
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len); // 读取多少个字节，就写入多少个字节
        }
        System.out.println("复制成功！");

        fis.close();
        fos.close();

    }
}

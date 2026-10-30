package com.java.study.demo6copy;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) {
        copyFile("java-se-demo\\src\\info.txt", "java-se-demo\\src\\info-output.txt");
    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath) {
        // 1、创建一个文件字节输入流管道与原文件接通
        try (
                // 这里只能放置资源对象，用完后，最终会自动调用其close方法关闭
                InputStream fis = new FileInputStream(srcPath);
                OutputStream fos = new FileOutputStream(destPath);
                MyConn conn = new MyConn(); // 自定义的资源对象，最终会自动调用其close方法关闭
        ){
            // 2、读取一个字节数组，写入一个字节数组
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConn implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("资源关闭了");
    }
}

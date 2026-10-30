package com.java.study.demo9bufferedInputStream;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        // 目标：掌握缓冲字节流的使用
        // 源文件：src\\watch.png
        // 目标文件：src\\watch-copy.png
        copyFile("src\\watch.png", "src\\watch-copy.png");
    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath) {
        // 1、创建一个文件字节输入流管道与源文件接通

        try (
                // 这里只能放置资源对象，用完后，最终会自动调用其close方法关闭
                InputStream fis = new FileInputStream(srcPath);
                // 把低级的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(fis);
                OutputStream fos = new FileOutputStream(destPath);
                // 把低级的字节输出流包装成高级的缓冲字节输出流
                OutputStream bos = new BufferedOutputStream(fos);

        ) {
            // 2、读取一个字节数组，写入一个字节输入组
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1) {
                // 读取多少个字节，就写入多少个字节
                bos.write(bytes, 0, len);
            }
            System.out.println("复制完成！");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



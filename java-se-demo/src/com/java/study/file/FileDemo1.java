package com.java.study.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //    目标：创建File对象，不创建物理文件。无论路径是否存在，对象都会成功创建，不会报错，也不会在磁盘上产生文件
//    1、创建File对象，去获取某个文件的信息
        File f1 = new File("E:\\resource\\nova.jpg");
        File f2 = new File("E:/resource2/nova2.jpg");

        System.out.println(f1.length());
        System.out.println(f1.getName());
        System.out.println(f1.isFile());
//        此时磁盘上没有这个文件，只是一个路径封装
        System.out.println(f1.exists());

        System.out.println(f2.length());
        System.out.println(f2.getName());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        // 2、可以使用相对路径定位文件对象
        // 只要带盘符的都称之为绝对路径 E:/resource/nova.png
        // 相对路径：不带盘符，默认是到你的idea工程下直接寻找文件的，一般用来找工程下的项目文件
        File f3 = new File("file\\FileDemo1");
        // 获取绝对路径
        System.out.println(f3.getAbsoluteFile()); // D:\study\java-demo\file\FileDemo1

        // 3、创建对象代表不存在的文件路径
        File f31 = new File("E:/resource");
        if (!f31.exists()) {
            f31.mkdirs();
        }
        File f32 = new File(f31, "config.txt");
        f32.createNewFile();

        File book = new File("E:\\book");
        String[] names = book.list();
        for (String name: names) {
            System.out.println(name);
        }

        File[] files = book.listFiles();
        for (File file: files) {
            System.out.println(file.getAbsoluteFile());
        }
    }

}

package com.itcast.demo02.Recursion;

import java.io.File;

/*
    练习:
        递归打印多级目录
    需求:
        遍历c:\\abc文件夹,及abc文件夹的子文件夹
        c:\\abc
        c:\\abc\\abc.txt
        c:\\abc\\abc.java
        c:\\abc\\a
        c:\\abc\\a\\a.jpg
        c:\\abc\\a\\a.java
        c:\\abc\\b
        c:\\abc\\b\\b.java
        c:\\abc\\b\\b.txt
 */
public class Demo04Recurison {
    public static void getAllFile(File dir){
        System.out.println(dir);  // 打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File file : files) {
            // 对遍历得到的File对象file进行判断，判断是否是文件夹
            if (file.isDirectory()){
                // 是文件夹，则继续遍历这个文件夹
                getAllFile(file);
            }else {
                // 是一个文件，直接打印即可
                System.out.println(file);
            }
        }
    }
}

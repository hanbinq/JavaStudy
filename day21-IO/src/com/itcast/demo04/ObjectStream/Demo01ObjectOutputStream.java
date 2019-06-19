package com.itcast.demo04.ObjectStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
* java.io.ObjectOutputStream extends OutputStream
* ObjectOutputStream: 对象的序列化流
* 作用:把对象以流的方式写入到文件中保存
*
* 构造方法:
*     ObjectOutputStream(OutputStream out) 创建写入指定OutputStream的ObjectOutputStream。
*     参数:
*         OutputStream out:字节输出流
*
* 使用步骤:
*     1. 创建ObjectOutputStream对象，构造方法中传递字节输出流
*     2. 使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
*     3. 释放资源
* */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws Exception {
        // 1. 创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("10_IO\\person.txt"));
        // 2. 使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        oos.writeObject(new Person("小白龙",18));
        // 3. 释放资源
        oos.close();
    }




}

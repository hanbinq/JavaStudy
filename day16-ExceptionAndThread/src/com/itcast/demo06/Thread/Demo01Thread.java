package com.itcast.demo06.Thread;
/*
* 创建多线程程序得第一种方式:创建Thread类的子类
* java.lang.Thread类:是描述线程的类，我们想要实现多线程程序，就必须继承Thread类
* */
public class Demo01Thread {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread mt = new MyThread();
        //4.调用Thread类中的方法start方法,开启新的线程,执行run方法
        mt.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println("main:"+i);
        }
    }
}

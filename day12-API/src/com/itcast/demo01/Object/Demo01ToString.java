package com.itcast.demo01.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* java.lang.Object
* 类Object是类层次结构的根(父)类。
* 每个类(Person，Student...)都使用Object作为超(父)类。
* 所有对象（包括数组）都实现这个类的方法。
* */
public class Demo01ToString {

    public static void main(String[] args) {
        /*
        * Person类默认继承了Object类，所以可以使用Object类中的toString方法
        * String toString() 返回该对象的字符串表示。
        * */
        Person p = new Person("张三", 18);
        String s = p.toString();
        System.out.println(s);  // com.itcast.demo01.Object.Person@16e8e0a

        // 直接打印对象的名字，其实就是调用对象的toString  p=p.toString();
        System.out.println(p);  // com.itcast.demo01.Object.Person@16e8e0a

        // 看一个类是否重写了toString，直接打印这个类的对象即可，如果没有重写toString方法那么打印的是对象的地址值
        Random r = new Random();
        System.out.println(r);  // java.util.Random@3f3afe78  没有重写toString方法

        Scanner sc = new Scanner(System.in);  // java.util.Scanner[delimiters=\p{javaWhitespace}+]  重写toString方法
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);  // [1, 2, 3] 重写toString方法
    }
}

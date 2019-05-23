package com.itcast.demo01.File;

import java.io.File;

/*
* 路径：
*     绝对路径：是一个完整的路径
*     以盘符(c:，D:)开始的路径
*         D:\\demo\\b.txt
*     相对路径：是一个简化的路径
*         相对指的是相对于当前项目的根目录
*         如果使用当前项目的根目录，路径可以简化书写
* 注意：
*     1.路径是不区分大小写
*     2.路径中的文件名称分隔符Windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
* */
public class Demo02File {
    public static void main(String[] args) {
        show01();


        File f = new File("D:\\own\\github\\JavaStudy\\day19-FileAndRecursion\\src\\com\\itcast\\test");
        long length = f.length();
        System.out.println(length);
    }

    /*
    * File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新File实例。
    * 参数：
    *     String pathname:字符串的路径名称
    *     路径可以是以文件结尾，也可以是以文件夹结尾
    *     路径可以是相对路径，也可以是绝对路径
    *     路径可以是存在的，也可以是不存在的
    *     创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
    * */
    private static void show01(){
        File f1 = new File("D:\\own\\github\\JavaStudy\\day19-FileAndRecursion\\src\\com\\itcast\\test\\a.txt");
        System.out.println(f1);  // 重写了Object类的toString方法  D:\own\github\JavaStudy\day19-FileAndRecursion\src\com\itcast\test\a.txt

        File f2 = new File("D:\\own\\github\\JavaStudy\\day19-FileAndRecursion\\src\\com\\itcast\\test");
        System.out.println(f2);  // D:\own\github\JavaStudy\day19-FileAndRecursion\src\com\itcast\test

        File f3 = new File("b.txt");
        System.out.println(f3);  //b.txt
    }

    /*
    * File(String parent,String child) 根据parent路径名字符串和child路径名字符串创建一个新File实例。
    * 参数：把路径分成
    *     String parent：父路径
    *     String child：子路径
    * 好处：
    *     父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
    * */
    private static void show02(String parent, String child){
        File file = new File(parent, child);
        System.out.println(file);  //c:\a.txt
    }

    /*
    * File(File parent,String child) 根据parent抽象路径名和child路径名字符串创建一个新的FIle实例。
    * 参数：把路径分成两部分
    *     File parent：父路径
    *     String child：子路径
    * 好处:
             父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
             父路径是File类型,可以使用File的方法对路径进行一些操作,再使用路径创建对象
    * */
    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent,"hello.java");
        System.out.println(file);//c:\hello.java
    }
}

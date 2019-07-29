package com.itcast.demo06.MethodReference;

/**
 * 通过类名引用静态成员方法
 * 类已经存在，静态成员方法也已经存在
 * 就可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {
    // 定义一个方法，方法的参数传递要计算绝对值的整数
    public static int method(int number, Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        // 调用method方法，传递计算绝对值的整数，和Lambda表达式
        int number = method(-10, (n) -> {
            // 对参数进行绝对值的计算并返回结果
            return Math.abs(n);
        });
    }
}

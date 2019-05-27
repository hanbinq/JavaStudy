package com.itcast.demo02.Recursion;
/*
* 练习：
*     使用递归计算1-n之间的和
* */
public class Demo02Recurison {
    public static void main(String[] args) {
        int sum = sum(3);
        System.out.println(sum);
    }

    /*
    *
    * */
    public static int sum(int n){
        // 获取到1的时候结束
        if (n==1){
            return 1;
        }
        // 获取下一个被加的数字(n-1)
        return n + sum(n-1);
    }
}

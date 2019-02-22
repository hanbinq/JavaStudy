package cn.itcast.day03;
// 题目：使用三元运算符合标准的if-else语句分别实现取两个数字中的最大值
public class Demo06Max {
    public static void main(String[] args) {
        int a = 105;
        int b = 20;

        // 首先使用三元运算符
        // int max = a > b ? a : b;

        // 使用今天的if语句
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("最大值：" + max);
    }
}

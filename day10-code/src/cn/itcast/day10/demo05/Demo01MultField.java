package cn.itcast.day10.demo05;

public class Demo01MultField {

    public static void main(String[] args) {
        // 使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);  // 父：10
//        System.out.println(obj.age);  // 错误写法！
        System.out.println("===========================");

        // 子类没有覆盖重写，就是父：10
        // 子类如果覆盖重写，就是子：20
        obj.showNum();
    }
}

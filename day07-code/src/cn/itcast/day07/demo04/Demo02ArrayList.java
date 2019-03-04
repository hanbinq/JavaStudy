package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo02ArrayList {

    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合的名称是list。里面装的全部是String字符串类型的数据
        // 备注：从JDK1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // 向集合当中添加一些数据，需要用到add方法。
        list.add("赵丽颖");
        System.out.println(list);  // [赵丽颖]

        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        System.out.println(list);  // [赵丽颖, 迪丽热巴, 古力娜扎, 玛尔扎哈]

//        list.add(100);  // 错误写法！因为创建的时候尖括号泛型已经说是字符串，添加进去的元素就必须是字符串才行
    }
}

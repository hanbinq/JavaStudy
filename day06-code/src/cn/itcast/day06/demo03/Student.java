package cn.itcast.day06.demo03;
/*
* 对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
* */
public class Student {

    private String name;  // 姓名
    private int age;  // 年龄
    private  boolean male;  //性别

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}

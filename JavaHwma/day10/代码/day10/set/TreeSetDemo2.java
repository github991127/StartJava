package com.itheima.day10.set;

import com.itheima.day10.domain.Student;

import java.util.TreeSet;

public class TreeSetDemo2 {
    /*
        TreeSet集合存储Student学生对象

                compareTo 方法的返回值 :

                    0 : 只有王五,25
                    1 : 正序排列
                    -1 : 倒序排列
     */
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student("王五", 25));
        ts.add(new Student("王五", 25));
        ts.add(new Student("王五", 25));
        ts.add(new Student("王五", 25));

        System.out.println(ts);
    }
}

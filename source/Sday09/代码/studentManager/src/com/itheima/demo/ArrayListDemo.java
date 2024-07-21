package com.itheima.demo;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Student stu1 = new Student("heima001","张三", 23, "1999-11-11");
        Student stu2 = new Student("heima002","李四", 24, "1999-11-12");
        Student stu3 = new Student("heima003","王五", 25, "1999-12-11");

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        String id = "heima006";

        int index = getIndex(id, list);

        System.out.println(index);
    }

    private static int getIndex(String id, ArrayList<Student> list) {
        // 1. 遍历集合, 获取到每一个学生对象
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // stu.getId() : 从集合中取出的学生学生
            // id : 要查找的学号
            // 2. 比对
            if(stu.getId().equals(id)){
                // 3. 找到了, 返回正确的索引
                return i;
            }
        }
        // 4. 没找到, 返回-1
        return -1;
    }
}

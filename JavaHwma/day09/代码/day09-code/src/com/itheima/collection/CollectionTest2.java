package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
    /*
        public Iterator<E> iterator() : 获取遍历集合的迭代器
        public E next() : 从集合中获取一个元素
        public boolean hasNext() : 如果仍有元素可以迭代，则返回 true

        注意: 如果next()方法调用次数过多, 会出现NoSuchElementException
     */
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();

        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));


        // 1. 获取迭代器
        Iterator<Student> it = c.iterator();

        // 2. 循环判断, 集合中是否还有元素
        while (it.hasNext()) {
            // 3. 调用next方法, 将元素取出
            Student stu = it.next();
            System.out.println(stu.getName() + "---" + stu.getAge());
        }

        System.out.println("--------------------");

        // 使用增强for循环遍历集合
        for (Student stu : c) {
            System.out.println(stu);
        }

        System.out.println("--------------------");

        // foreach方法遍历集合
        c.forEach(stu -> System.out.println(stu));

    }
}

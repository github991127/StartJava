package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest1 {
    /*
        Collection的常用方法 :

            public boolean add(E e) : 把给定的对象添加到当前集合中
            public void clear() : 清空集合中所有的元素
            public boolean isEmpty() : 判断当前集合是否为空
            public boolean remove(E e) : 把给定的对象在当前集合中删除
            public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象
            public int size() : 返回集合中元素的个数(集合的长度)
     */
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));

        System.out.println(c.contains(new Student("李四", 24)));

    }

    private static void method() {
        // 以多态的形式创建集合对象, 调用单列集合中的共有方法
        Collection<String> c = new ArrayList<>();

        c.add("张三");
        c.add("李四");
        c.add("王五");

        boolean b = c.contains("赵四");
        System.out.println(b);

        System.out.println(c.size());
    }
}

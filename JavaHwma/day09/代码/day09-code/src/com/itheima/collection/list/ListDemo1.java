package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    /*
        List接口的特点 : 存取有序, 有索引, 可以存储重复的

        和索引有关的API :

            public void add(int index, E element) : 在指定的索引位置, 添加元素
            public E remove(int index) : 根据索引删除集合中的元素
            public E set(int index, E element) : 根据索引修改集合中的元素
            public E get(int index) : 返回指定索引处的元素
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        list.set(0, "赵六");
        list.remove(1);

        System.out.println(list.get(0));

        System.out.println(list);

        System.out.println("-------------------------");

        List<Integer> list2 = new ArrayList<>();

        list2.add(111);        // Integer e = 111;
        list2.add(222);
        list2.add(333);

        list2.remove(Integer.valueOf(222)); // 手动装箱按数字删除，否则按索引删除

        System.out.println(list2);


    }
}

package com.itheima.day11.hashset;

public class StringDemo {
    /*
       问题: 该如何重写hashCode方法?
       回答: 应该将该类的所有属性, 参与到哈希值的计算当中
                   只有这样做, (哈希值冲突)的概率, 才会比较小.

    */
    public static void main(String[] args) {
        // String类重写过hashCode方法, 是根据字符串的每一个字符进行计算
        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());
    }
}

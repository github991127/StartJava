package com.itheima.day10.generics;

public class GenericsDemo3 {
    /*
        泛型方法
                1. 非静态的方法 : 内部的泛型, 会根据类的泛型去匹配
                2. 静态的方法 : 静态方法中如果加入了泛型, 必须声明出自己独立的泛型
                                    - 时机: 在调用方法, 传入实际参数的时候, 确定到具体的类型
     */
    public static void main(String[] args) {

        String[] arr1 = {"张三", "李四", "王五"};
        Integer[] arr2 = {11, 22, 33};
        Double[] arr3 = {11.1, 22.2, 33.3};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);


    }

    public static <T> void printArray(T[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
}

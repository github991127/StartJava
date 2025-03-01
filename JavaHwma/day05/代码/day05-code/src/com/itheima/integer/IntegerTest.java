package com.itheima.integer;

public class IntegerTest {
    /*
        已知字符串 String s = "10,50,30,20,40";
        请将该字符串转换为整数并存入数组
        随后求出最大值打印在控制台
     */
    public static void main(String[] args) {
        String s = "10,50,30,20,40";

        // 1. 根据逗号做切割
        String[] sArr = s.split(",");

        // 2. 准备一个整数数组, 准备存储转换后的数字
        int[] nums = new int[sArr.length];

        // 3. 遍历字符串数组
        for (int i = 0; i < sArr.length; i++) {
            // sArr[i] : 每一个数字字符串
            // 4. 将数字字符串转换为整数, 并存入数组
            nums[i] = Integer.parseInt(sArr[i]);
        }

        // 5. 求最大值
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("最大值为:" + max);
    }
}

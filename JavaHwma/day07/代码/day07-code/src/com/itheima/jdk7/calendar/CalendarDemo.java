package com.itheima.jdk7.calendar;

import java.util.Calendar;

public class CalendarDemo {
    /*
        Calendar : 代表的是系统此刻时间对应的日历，通过它可以单独获取、修改时间中的年、月、日、时、分、秒等。

        1. 创建对象 :
                public static Calendar getInstance() : 获取当前时间的日历对象
        2. 常用方法 :
                public int get(int field) : 取日历中的某个字段信息

                               get方法的参数 : Calendar类中的静态常量

                                    Calendar.YEAR : 获取年份信息
                                    Calendar.MONTH : 月份是0~11, 记得做+1操作
                                    Calendar.DAY_OF_MONTH : 获取日
                                    Calendar.DAY_OF_WEEK : 获取星期, 获取星期的时候, 需要提前设计一个数组
                                    Calendar.DAY_OF_YEAR : 获取一年中的第几天


                public void set(int field,int value) : 修改日历的某个字段信息
                public void add(int field,int amount) : 为某个字段增加/减少指定的值
     */
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR, -1);

        System.out.println(c.get(Calendar.YEAR));

    }

    private static void setMethod() {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, 2022);
        c.set(2008,8,8);

        System.out.println(c.get(Calendar.YEAR));
    }

    private static void getMethod() {
        // Calendar c : 抽象类
        // Calendar.getInstance() : 获取的是子类对象
        // 1. 获取当前时间的日历对象
        Calendar c = Calendar.getInstance();

        // 2. 调用get方法, 获取指定字段的信息
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 注意Calendar类的月份是 0~11, 想要获取常规的月份, 需要对结果 + 1操作
        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        char[] weeks = {' ', '日', '一', '二', '三', '四', '五', '六'};
        //  0     1     2    3     4     5    6    7

        int weekIndex = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(weeks[weekIndex]);

        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);
    }
}

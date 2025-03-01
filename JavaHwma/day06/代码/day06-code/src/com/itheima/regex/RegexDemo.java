package com.itheima.regex;

public class RegexDemo {
    /*
        正则表达式 : 本质来说就是一个字符串, 可以指定一些规则, 来校验其他字符串.
     */

    /*

        [] : 单个字符

        1. 字符类 :
        ---------------------------------------------------------------------------
        [abc]	       只能是a, b, 或c
        [^abc]	       除了a, b, c之外的任何字符
        [a-zA-Z]       a到z A到Z，包括（范围）
        [a-d[m-p]]	   a到d，或m通过p：（[a-dm-p]联合）
        [a-z&&[def]]   d, e, 或f(交集)
        [a-z&&[^bc]]   a到z，除了b和c：（[ad-z]减法）
        [a-z&&[^m-p]]  a到z，除了m到p：（[a-lq-z]减法）
        ---------------------------------------------------------------------------
     */

    /*
        2. 预定义字符类:
        ---------------------------------------------------------------------------
        .	任何字符
        \d	一个数字： [0-9]
        \D	非数字： [^0-9]
        \s	一个空白字符： [ \t\n\x0B\f\r]
        \S	非空白字符： [^\s]
        \w	[a-zA-Z_0-9] 英文、数字、下划线
        \W	 [^\w] 一个非单词字符

        \ : 转义字符

        System.out.println("\t");           \ ---> t ---> 解密成功 ---> tab键

        ---------------------------------------------------------------------------
     */

    /*
        3. 数量:
        ---------------------------------------------------------------------------
        X?	X, 一次或0次
        X*	X, 零次或多次 (任意次数)
        X+	X, 一次或多次
        X {n}	X，正好n次
        X {n, }	X，至少n次
        X {n,m}	X，至少n但不超过m次
        ---------------------------------------------------------------------------
     */

    public static void main(String[] args) {

        String regex = "\\d{3,5}";

        System.out.println("12".matches(regex));
        System.out.println("123".matches(regex));
        System.out.println("12345".matches(regex));
        System.out.println("123456".matches(regex));


    }

}

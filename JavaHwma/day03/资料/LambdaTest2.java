package com.itheima.lambda;

public class LambdaTest2 {
    public static void main(String[] args) {

    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("itheima");
    }
}

interface StringHandler {
    void printMessage(String msg);
}

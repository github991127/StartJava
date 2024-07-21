package com.itheima.lambda;

public class LambdaTest1 {
    public static void main(String[] args) {

    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }

}

interface ShowHandler {
    void show();
}
package com.sboo;

import java.util.List;

public class App {
    static String nickName = "sboo";
    static String realName;

    static {
        realName = "Sang Hoon";
    }

    private String foo = "bar";

    public static void main(String[] args) {
        Thread.currentThread(); //Native Method(Java로 구현x)
        System.out.println(App.class.getClassLoader());
        System.out.println(App.class.getSuperclass());
        System.out.println(List.class.getClassLoader());
    }
}

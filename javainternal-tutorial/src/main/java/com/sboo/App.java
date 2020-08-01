package com.sboo;

public class App {

    //클래스 로더 초기화 단게에서 할당.
    static String name1 = "sboo";
    static String name2;
    static {
        name2 = "Sang Hoon";
    }

    public static void main(String[] args) {
        ClassLoader classLoader = App.class.getClassLoader();
        //App을 읽어드린 ClassLoader
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());

        System.out.println(classLoader.getParent().getParent());
        //Native로 구현되어 있어서(Bootstrap ClassLoader)
        //Java Code로 참조해서 출력X
    }
}

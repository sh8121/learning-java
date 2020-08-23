package com.sboo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyData md1 = new MyData();
        md1.xpos = 10;
        md1.ypos = 11;
        md1.name = "홍길동";

        MyData md2 = new MyData();
        md2 = md1;
        //객체 Pool에서 같은 객체 공유.
        //얕은 복사도 Flyweight Pattern의 좋은 예.

        MyData md3 = new MyData();
        md3.xpos = 20;
        md3.ypos = 21;
        md3.name = "손오공";

        md2.name = "전우치";
        md2.xpos = 5;
    }
}

class MyData {
    int xpos;
    int ypos;
    String name;
}
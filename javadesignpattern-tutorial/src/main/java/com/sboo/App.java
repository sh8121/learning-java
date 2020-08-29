package com.sboo;

import java.time.LocalDate;
import java.time.Month;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PlayController controller = new PlayController();
        Observer ob1 = new MyClassA(controller);
        Observer ob2 = new MyClassB(controller);
        //Main Class 와 Controller/Observer Class의 관계를 느슨하게 만든다.

        System.out.println("------모든 클래스 일시정지-----");
        controller.setFlag(false);

        System.out.println();

        System.out.println("------모든 클래스 다시시작-----");
        controller.setFlag(true);
    }
}
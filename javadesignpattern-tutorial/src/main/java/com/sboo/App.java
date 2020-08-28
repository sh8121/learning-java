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
        MyClassA classA = new MyClassA(controller);
        MyClassB classB = new MyClassB(controller);

        System.out.println("--------모든 클래스 일시정지-------");
        controller.setFlag(false);

        System.out.println();

        System.out.println("--------모든 클래스 다시시작-------");
        controller.setFlag(true);

        System.out.println();
    }
}
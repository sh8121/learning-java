package com.sboo;

import com.sboo.base.AmericanStudent;
import com.sboo.base.Student;
import com.sboo.decorator.Art;
import com.sboo.decorator.Science;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student g1 = new AmericanStudent();
        System.out.println(g1.getDescription());

        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());
    }
}
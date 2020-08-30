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
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("printer");
        System.out.println("The product is a " + simpleProductFacade.getName());
    }
}
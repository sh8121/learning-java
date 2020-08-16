package com.sboo;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Database database;
        database = Database.getInstance("첫번째 Database");
        System.out.println("This is the " + database.getName());

        database = Database.getInstance("두번째 Database");
        System.out.println("This is the " + database.getName());
    }
}

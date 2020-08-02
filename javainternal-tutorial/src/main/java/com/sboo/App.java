package com.sboo;

import java.lang.reflect.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class<?> bookClass = Class.forName("com.sboo.Book");
//        Constructor<?> constructor = bookClass.getConstructor(null);
//        Book book =  (Book)constructor.newInstance();
//        System.out.println(book);
//
//        Constructor<?> constructor1 = bookClass.getConstructor(String.class);
//        Book book1 = (Book)constructor1.newInstance("myBook");
//        System.out.println(book1);



//        Field a = Book.class.getDeclaredField("A");
//        System.out.println(a.get(null));
//        a.set(null, "AAAAAA");
//        System.out.println(a.get(null));
//
//        Book book = new Book("myBook");
//        Field b = Book.class.getDeclaredField("B");
//        b.setAccessible(true);
//        System.out.println(b.get(book));
//        b.set(book, "BBBBBBBB");
//        System.out.println(b.get(book));


        Book book = new Book();
        Method c = Book.class.getDeclaredMethod("c");
        c.setAccessible(true);
        c.invoke(book);

        Method sum = Book.class.getMethod("sum", int.class, int.class);
        int invoke = (int)sum.invoke(book, 1, 2);
        System.out.println(invoke);
    }
}

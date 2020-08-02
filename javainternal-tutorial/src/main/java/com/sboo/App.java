package com.sboo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        Arrays.stream(Book.class.getAnnotations())
//                .forEach(System.out::println);

        Arrays.stream(MyBook.class.getAnnotations())
                .forEach(System.out::println);

        System.out.println("========");

        Arrays.stream(MyBook.class.getDeclaredAnnotations())
                .forEach(System.out::println);

        System.out.println("========");

        Arrays.stream(Book.class.getDeclaredFields())
                .forEach(f -> {
                    Arrays.stream(f.getAnnotations())
                            .forEach(a -> {
                                if(a instanceof MyAnnotation) {
                                    MyAnnotation a1 = (MyAnnotation) a;
                                    System.out.println(a1.value());
                                    System.out.println(a1.name());
                                    System.out.println(a1.number());
                                }
                            });
                });
    }
}

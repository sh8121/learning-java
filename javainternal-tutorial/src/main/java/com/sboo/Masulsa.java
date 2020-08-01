package com.sboo;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {
    public static void main(String[] args){
        ClassLoader classLoader = Masulsa.class.getClassLoader();
        TypePool typePool = TypePool.Default.of(classLoader);

        try {
            new ByteBuddy().redefine(
                    typePool.describe("com.sboo.Moja").resolve(),
                    ClassFileLocator.ForClassLoader.of(classLoader))
                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit"))
                    .make().saveIn(new File("/Users/sboo/Desktop/Development/Backend/Java/learning-java/javainternal-tutorial/target/classes/"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(new Moja().pullOut());
        //여기가 최초로 Moja class 를 로드하는 포인트가 됨.
    }
}

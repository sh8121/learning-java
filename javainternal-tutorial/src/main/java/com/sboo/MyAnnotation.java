package com.sboo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface MyAnnotation {
    String value() default "Sang Hoon";

    String name() default "sboo";

    int number() default 100;
}

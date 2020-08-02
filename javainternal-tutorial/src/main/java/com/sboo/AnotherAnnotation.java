package com.sboo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AnotherAnnotation {
    String value() default "Sang Hoon";
    int number() default 100;
}

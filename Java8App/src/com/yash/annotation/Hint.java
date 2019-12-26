package com.yash.annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Repeatable(Hints.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hint {
    String value();
}
package com.example.springbootdemo.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * 锁的注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CacheLock {
    /**
     * redis锁的前缀
     */
    String prefix() default "";

    /**
     * 过期秒数，默认为5s
     */
     int expire() default 5;

    /**
     * 超时时间单位
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;

    /**
     * key的分隔符
     */
    String delimiter() default ":";



}

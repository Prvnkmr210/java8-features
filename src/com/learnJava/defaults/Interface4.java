package com.learnJava.defaults;

public interface Interface4 {

    default void methodA(){

        System.out.println("Inside Method A" + Interface1.class);
    }
}

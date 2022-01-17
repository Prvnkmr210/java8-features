package com.learnJava.defaults;

public interface Interface14 extends Interface1,Interface4{

    @Override
    default void methodA() {
        Interface1.super.methodA();
    }
}

package com.marcinjc.trywithresouces;

public class MyContextManagerMain {
    public static void main(String[] args) {
        try (MyContextManager manager = new MyContextManager()) {
            manager.doSomething();
        }
    }
}

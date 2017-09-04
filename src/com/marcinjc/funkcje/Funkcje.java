package com.marcinjc.funkcje;

public class Funkcje {

    public static void main(String[] args) {
        boolean product = isBig(200);
        System.out.println(product);
    }

    static boolean isBig(int number) {
        return number > 100;
    }
}


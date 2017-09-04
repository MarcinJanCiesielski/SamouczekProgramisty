package com.marcinjc.pierwszyprogram;

public class Weather {
    public static void main(String[] args) {
        String msg1 = "Jest pogodnie";
        System.out.println(msg1);

        String msg2 = "Jest słonecznie";
        System.out.println(msg2);

        String msg3 = "Polepsza się";
        System.out.println(msg3);

        System.out.println("Długość sumy poprzednich zdań to: " + (msg1.length() + msg2.length() + msg3.length()));
    }
}

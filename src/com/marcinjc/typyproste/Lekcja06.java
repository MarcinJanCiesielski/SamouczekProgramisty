package com.marcinjc.typyproste;

import java.util.Scanner;

public class Lekcja06 {
    public static void main(String[] args) {
        double[] temperature = new double[7];
        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Wprowadź temperaturę:");
            temperature[i] = inputScanner.nextDouble();
        }

        double sumarizedTemp = 0;
        for(double temp: temperature){
            sumarizedTemp += temp;
        }

        System.out.println("Średnia temperatura wynosi " + (sumarizedTemp / temperature.length));
    }
}

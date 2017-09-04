package com.marcinjc.typyproste;

import java.util.Scanner;

public class Zadanie06 {
    public static void main(String[] args) {
        float[][] oceny = new float[3][4];
        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < oceny[0].length; i++) {
            System.out.print("Podaj ocenę z matematyki:");
            oceny[0][i] = inputScanner.nextFloat();
        }
        for (int i = 0; i < oceny[1].length; i++) {
            System.out.print("Podaj ocenę z polskiego:");
            oceny[1][i] = inputScanner.nextFloat();
        }
        for (int i = 0; i < oceny[2].length; i++) {
            System.out.print("Podaj ocenę z biologi:");
            oceny[2][i] = inputScanner.nextFloat();
        }
        int iloscOcen = 0;
        double sumaOcen = 0;
        for (int i = 0; i < oceny.length ; i++) {
            for (int j = 0; j < oceny[i].length; j++) {
                sumaOcen += oceny[i][j];
                iloscOcen++;
            }
        }
        System.out.println("Srednia oceny wynosi: " + (sumaOcen/iloscOcen));
    }
}

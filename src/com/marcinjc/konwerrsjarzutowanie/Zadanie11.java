package com.marcinjc.konwerrsjarzutowanie;

import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {
        zadanie04();
    }

    public static void zadanie01(){
        System.out.print("Podaj liczbę do przemnożenia:");
        Scanner scanner = new Scanner(System.in);
        double liczba;
        if (scanner.hasNextDouble()) {
            liczba = scanner.nextDouble();
        } else {
            System.out.println("Niewłaściwy argument!!!");
            return;
        }
        System.out.println("Wynik: " + (liczba * Math.PI));
    }

    public static void zadanie02(){
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        Scanner scanner = new Scanner(System.in);
        long liczba1, liczba2;
        if (scanner.hasNextLong()) {
            liczba1 = scanner.nextLong();
        } else {
            System.out.println("Niewłaściwy argument!!!");
            return;
        }

        System.out.println("Podaj drugą liczbę całkowitą: ");
        if (scanner.hasNextLong()) {
            liczba2 = scanner.nextLong();
        } else {
            System.out.println("Niewłaściwy argument!!!");
            return;
        }
        System.out.println("Wynik dzielenia obu liczb: " + (liczba1 / (float) liczba2));
    }

    public static void zadanie03(){
        Integer object = null;
        int liczba = object;
    }

    public static void zadanie04(){
        char znak = 'c';
        int liczba = znak;

        System.out.println(liczba);

    }
}

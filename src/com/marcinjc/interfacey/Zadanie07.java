package com.marcinjc.interfacey;

import java.util.Scanner;

public class Zadanie07 {
    public static void main(String[] args) {
        Zadanie07 main = new Zadanie07();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        final String MULTIPLICATION = "mnoz";
        System.out.print("Jakie działanie chcesz wykonać: mnożenie (wpisz >>mnoz<<) czy dodawanie (wpisz >>dodaj<<): ");
        Scanner scanner = new Scanner(System.in);
        String dzialanie = scanner.next();
        System.out.println(dzialanie);
        return dzialanie.equals(MULTIPLICATION);
    }

    private double getArgument() {

        System.out.print("Wprowadź liczbę: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}

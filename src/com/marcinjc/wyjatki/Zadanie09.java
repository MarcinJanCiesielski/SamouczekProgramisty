package com.marcinjc.wyjatki;

import java.util.Scanner;

public class Zadanie09 {

    public static void main(String[] args) {
        double number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dla któej chcesz obliczyć pierwiastek: ");
        if(scanner.hasNextDouble()){
            number=scanner.nextDouble();
        } else {
            throw new IllegalArgumentException("Podany argument nie jest liczbą");
        }
        double pierwiastek;
        try{
            pierwiastek = square(number);
        } catch (IllegalArgumentException exception){
            pierwiastek = square(number * (-1.0));
        }
        System.out.println("Pierwiastek dla podanej liczby: " + pierwiastek);

    }

    public static double square(double number) throws IllegalArgumentException {
        if(number <0) {
            throw new IllegalArgumentException("Argument musi być większy lub równy zero");
        } else {
            return Math.sqrt(number);
        }
    }
}

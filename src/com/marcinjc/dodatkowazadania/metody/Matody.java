package com.marcinjc.dodatkowazadania.metody;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Matody {

    public static void main(String[] args) {
        System.out.println(getMojWiek());
    }

    public static long getMojWiek(){ //zadanie01
        LocalDate dataUrodzenia = LocalDate.of( 1979 , 1 , 1 ) ;
        LocalDate stop = LocalDate.now( ZoneId.of( "GMT+1" ) );
        long years = java.time.temporal.ChronoUnit.YEARS.between( dataUrodzenia , stop );

        return years;
    }

    public static String getMojeImie(){ //zadanie02
        return "Marcin";
    }

    public static void dzialania(double liczba1, double liczba2){ //zadanie03
        System.out.println("Dodawanie: " +(liczba1 + liczba2));
        System.out.println("Mnożenia: " +(liczba1 * liczba2));
        System.out.println("Odejmowanie: " +(liczba1 - liczba2));
    }

    public static boolean isParzysta(long liczba) { //zadanie04
        return liczba % 2 == 0;
    }

    public static boolean isDividedBy3And5(long liczba){ //zadnie05
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    public static long cube(long liczba){ //zadanie06
        return liczba^3;
    }

    public static double square(double liczba) { //zadanie07
        if(liczba>=0){
            return Math.sqrt(liczba);
        } else  {
            return Math.sqrt(liczba*(-1));
        }
    }

    public static boolean triangle(int a, int b, int c){ //zadanie08
        int[] tab = new int[] {a,b,c};
        return Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2);
    }

}

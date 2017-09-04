package com.marcinjc.dodatkowazadania.typyproste;

import com.marcinjc.dodatkowazadania.petleiify.Zadanie06;

import java.util.Scanner;

public class Zadanie02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Podaj liczbę całkowitą do przekształcenia na kod binarny: ");
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
            System.out.println(Zadanie06.toBinary(number));
        } else {
            System.out.println("Podany przez Ciebie argument nie jest liczbą całkowitą!");
        }

    }
}

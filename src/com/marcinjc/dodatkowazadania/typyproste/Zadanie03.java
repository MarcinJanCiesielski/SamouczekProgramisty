package com.marcinjc.dodatkowazadania.typyproste;

import com.marcinjc.dodatkowazadania.petleiify.Zadanie06;

import java.util.Scanner;

import static com.marcinjc.dodatkowazadania.petleiify.Zadanie09.printArray;

public class Zadanie03 {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile liczb chcesz podać: ");
        int number;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        } else {
            throw new IllegalArgumentException("Podany przez Ciebie argument nie jest liczbą całkowitą!");
        }

        int[] tablica = new int[number];
        for (int i = 0; i < tablica.length; i++) {
            System.out.print("Podaj liczbę nr " + (i+1) +": ");
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
                tablica[i] = number;
            } else {
                throw new IllegalArgumentException("Podany przez Ciebie argument nie jest liczbą całkowitą!");
            }
        }
        printArray(sort(tablica));
    }
    public static int[] sort(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if(tab[i]<tab[j]){
                    int temp = tab[j];
                    tab[j] = tab[i];
                    tab[i] = temp;
                }
            }
        }
        return tab;
    }

}

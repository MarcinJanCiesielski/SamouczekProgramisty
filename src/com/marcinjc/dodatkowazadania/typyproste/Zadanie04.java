package com.marcinjc.dodatkowazadania.typyproste;

import java.util.Scanner;

import static com.marcinjc.dodatkowazadania.petleiify.Zadanie05.printRevertedString;
import static com.marcinjc.dodatkowazadania.petleiify.Zadanie07.isPalidrom;

public class Zadanie04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków:");

        String ciag = scanner.next();

        System.out.println("Długość podanego ciągu to: " + ciag.length());
        boolean palindrom = isPalidrom(ciag);
        String odp;
        if(palindrom){
            odp = "jest";
        } else {
            odp = "nie jest";
        }
        System.out.println("Ciąg " + odp + " palindromem");
        System.out.print("Odwrócony ciąg to: ");
        printRevertedString(ciag);
    }
}

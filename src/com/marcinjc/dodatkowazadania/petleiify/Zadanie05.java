package com.marcinjc.dodatkowazadania.petleiify;

public class Zadanie05 {
    public static void main(String[] args) {
        printRevertedString("pies");
    }

    public static void printRevertedString(String ciag){
        char[] znaki = ciag.toCharArray();

        for (int i = znaki.length-1; i >= 0 ; i--) {
            System.out.print(znaki[i]);
        }
        System.out.println("");
    }


}

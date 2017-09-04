package com.marcinjc.dodatkowazadania.petleiify;

public class Zadanie04 {

    public static void main(String[] args) {
        printRevertedInt(1234567);
    }

    public static void printRevertedInt(int number){
        String num = String.valueOf(number);
        char[] numb = num.toCharArray();

        for (int i = numb.length-1; i >= 0 ; i--) {
            System.out.print(numb[i]);
        }
    }
}

package com.marcinjc.dodatkowazadania.petleiify;

public class Zadanie07 {

    public static void main(String[] args) {
        String slowo = "kotek";
        boolean wynik = isPalidrom(slowo);
        System.out.println("Słowo: " + slowo +", Wynik: " + wynik);
    }

    public static boolean isPalidrom(String word){
        char[] chWord = word.toCharArray();

        for(int i=0, j=chWord.length-1; i<(chWord.length/2) || j>(chWord.length/2); i++, j--){
            if(chWord[i] != chWord[j]){
                return false;
            }
        }
        return true;
    }
}

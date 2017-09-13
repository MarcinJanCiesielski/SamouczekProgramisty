package com.marcinjc.dodatkowazadania.petleiify;

public class Zadanie09 {
    public static void main(String[] args) {
        int[] tablica = new int[] {1,2,3,4,5,6,7,8,9};
        printArray(tablica);
    }

    public static void printArray(int[] tablica){
        System.out.print("[");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]);
            if(i<tablica.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

package com.marcinjc.dodatkowazadania.petleiify;

public class Zadanie10 {

    public static void main(String[] args) {
        int[] tablica = new int[] {1,2,9,4,5,8,7,3,6};
        int[] tab = bubbleSort(tablica);
        printArray(tab);
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

    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }
}

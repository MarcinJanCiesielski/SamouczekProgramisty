package com.marcinjc.tablice;

public class Zadanie04 {

    public static void main(String[] args) {
        int[] table1 = new int[2];
        table1[0]=245;
        table1[1]=852;

        printSum(table1);


        int[] table2 = new int[] {852, 85, 6516};
        printMax(table2);

        printSudoku();

    }

    public static void printSum(int...tab){
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum = sum+tab[i];
        }
        System.out.println("Suma: " + sum);
    }

    public static void printMax(int ... tab) {
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]>max)
                max = tab[i];
        }
        System.out.println("Największa liczba w tablicy to: " + max);
    }

    public static void printSudoku(){
        Integer[][] sudokuBoard = new Integer[9][];
        sudokuBoard[0] = new Integer[] {2,    null, null, 6,    null, 7,    5,    null, null};
        sudokuBoard[1] = new Integer[] {null, null, null, null, null, null, null, 9,    6};
        sudokuBoard[2] = new Integer[] {6,    null, 7,    null, null, 1,    3,    null, null};
        sudokuBoard[3] = new Integer[] {null, 5,    null, 7,    3,    2,    null, null, null};
        sudokuBoard[4] = new Integer[] {null, 7,    null, null, null, null, null, 2,    null};
        sudokuBoard[5] = new Integer[] {null, null, null, 1,    8,    9,    null, 7,    null};
        sudokuBoard[6] = new Integer[] {null, null, 3,    5,    null, null, 6,    null, 4};
        sudokuBoard[7] = new Integer[] {8,    4,    null, null, null, null, null, null, null};
        sudokuBoard[8] = new Integer[] {null, null, 5,    2,    null, 6,    null, null, 8};

        System.out.println("Tablica sudoku:");

        for (int i = 0; i < sudokuBoard.length; i++) {
            for (int j = 0; j < sudokuBoard[i].length; j++) {
                System.out.print(sudokuBoard[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}

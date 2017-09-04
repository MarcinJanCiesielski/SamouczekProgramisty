package com.marcinjc.tablice;

public class Lekcja04 {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "poniedziałek";
        daysOfWeek[1] = "wtorek";
        daysOfWeek[2] = "środa";
        daysOfWeek[3] = "czwartek";
        daysOfWeek[4] = "piątek";
        daysOfWeek[5] = "sobota";
        daysOfWeek[6] = "niedziela";

        daysOfWeek[0] = "Monday";

        //System.out.println(daysOfWeek[7]);

        String[] wintersMonths = new String[] {"grudzień", "styczeń", "luty"};

        System.out.println(wintersMonths.length); // w naszy przypadku wyświetli 3


        int[][] ticTacToeBoard = new int[3][];
        ticTacToeBoard[0] = new int[3];
        ticTacToeBoard[1] = new int[3];
        ticTacToeBoard[2] = new int[3];


        int nought = 1; // kółko
        int cross = 2; // krzyżyk
        ticTacToeBoard[1][1] = nought;
        ticTacToeBoard[2][2] = cross;
        ticTacToeBoard[0][0] = nought;
        ticTacToeBoard[1][2] = cross;
        ticTacToeBoard[0][2] = nought;
        ticTacToeBoard[0][1] = cross;

        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                System.out.print(ticTacToeBoard[i][j]);
            }
            System.out.println("");
        }

    }

}

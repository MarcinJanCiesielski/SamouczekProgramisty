package com.marcinjc.dodatkowazadania.tablice;

public class Tablice {


    public static String[] alphabet(){
        String[] alphabet = new String[]{"a","b","c","d","e"};
        return alphabet;
    }

    public static int[] revert(int[] table){
        int[] tab = new int[] {table[2], table[1], table[0]};
        return tab;
    }
}

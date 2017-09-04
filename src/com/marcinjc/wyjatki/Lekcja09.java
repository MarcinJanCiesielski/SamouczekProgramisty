package com.marcinjc.wyjatki;

public class Lekcja09 {

    public static void main(String[] args) {
        int hours = -3;
        int numberOfSeconds = 0;
        try {
            numberOfSeconds = getNumberOfSeconds(hours);
        }
        catch (IllegalArgumentException exception) {
            numberOfSeconds = getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);
    }
    public static int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }
}

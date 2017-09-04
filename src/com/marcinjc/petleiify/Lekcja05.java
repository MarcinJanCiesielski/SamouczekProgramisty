package com.marcinjc.petleiify;

public class Lekcja05 {

    public static void main(String[] args) {
        int temperature = 38;
        if (temperature < 36) {
            System.out.println("Jesteś osłabiony?");
        }
        else if (temperature < 37) {
            System.out.println("Wszystko w normie!");
        }
        else if (temperature < 38) {
            System.out.println("Jesteś przeziębiony?");
        }
        else {
            System.out.println("Masz co najmniej 38 stopni! Biegiem do lekarza!");
        }

        temperature = 37;
        switch (temperature) {
            case 35:
                System.out.println("Jesteś osłabiony?");
                break;
            case 36:
                System.out.println("Wszystko w normie!");
                break;
            case 37:
                System.out.println("Jesteś przeziębiony?");
                break;
            case 38:
                System.out.println("Chyba jesteś chory.");
                break;
            default:
                System.out.println("Nie wiem jak się czujesz :(");
                break;
        }

        temperature = 35;
        switch (temperature) {
            case 35:
                System.out.println("Jesteś osłabiony?");
            case 36:
                System.out.println("Wszystko w normie!");
            case 37:
                System.out.println("Jesteś przeziębiony?");
                break;
            case 38:
                System.out.println("Chyba jesteś chory.");
                break;
        }


        for (int number = 0; number <= 10; number++) {
            System.out.println(number);
        }

        int[] primeNumbers = new int[] {2, 3, 5, 7};
        for (int index = 0; index < primeNumbers.length; index++) {
            System.out.println(primeNumbers[index]);
        }

        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }

        number = 0;
        while (true) {
            System.out.println(number);
            number++;
            if (number == 10) {
                break;
            }
        }

    }
}

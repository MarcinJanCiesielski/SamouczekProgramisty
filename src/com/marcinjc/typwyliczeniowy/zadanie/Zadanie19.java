package com.marcinjc.typwyliczeniowy.zadanie;

public class Zadanie19 {

    public static void main(String[] args) {
        Human czlowiek = new Human("Marcin", 38, EyeColour.BLUE, HairColour.BLOND);
        System.out.println(czlowiek.hairColour);

        double wynik = Computation.ADD.perform(12.0, 12.0);
        System.out.println(wynik);
    }
}

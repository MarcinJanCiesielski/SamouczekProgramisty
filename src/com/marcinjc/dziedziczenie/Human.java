package com.marcinjc.dziedziczenie;

public class Human extends Mammal {
    public final static int NUMBER_OF_LEGS = 2;

    public Human(String colour) {
        super(colour, NUMBER_OF_LEGS);
    }

    @Override
    public String toString() {
        return "Species: Human, colour: " + colour + ", number of legs: " + NUMBER_OF_LEGS;
    }
}

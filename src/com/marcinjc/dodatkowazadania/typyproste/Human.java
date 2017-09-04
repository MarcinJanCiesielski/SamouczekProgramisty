package com.marcinjc.dodatkowazadania.typyproste;

import com.marcinjc.dodatkowazadania.typyproste.Mammal;

public class Human extends Mammal {
    public final static Integer NUMBER_OF_LEGS = 2;

    public Human(String colour) {
        super(colour, NUMBER_OF_LEGS);
    }

    @Override
    public String toString() {
        return "Species: Human, colour: " + colour + ", number of legs: " + NUMBER_OF_LEGS;
    }
}

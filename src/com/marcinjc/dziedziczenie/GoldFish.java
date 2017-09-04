package com.marcinjc.dziedziczenie;

public class GoldFish extends Fish {
    public static final int NUMBER_OF_FINS = 4;

    public GoldFish(String colour) {
        super(colour, NUMBER_OF_FINS);
    }

    @Override
    public String toString() {
        return "Species: Gold Fish, colour: " + colour + ", number of fins: "  + NUMBER_OF_FINS;
    }

}

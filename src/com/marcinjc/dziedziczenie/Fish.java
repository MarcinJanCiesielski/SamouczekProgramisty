package com.marcinjc.dziedziczenie;

public abstract class Fish extends Animal{

    int numberOfFins;

    public Fish(String colour, int fins){
        super(colour);
        this.numberOfFins = fins;
    }
}

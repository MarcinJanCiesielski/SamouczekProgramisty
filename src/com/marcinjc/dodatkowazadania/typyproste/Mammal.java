package com.marcinjc.dodatkowazadania.typyproste;

import com.marcinjc.dodatkowazadania.typyproste.Animal;

public abstract class Mammal extends Animal {
    Integer numberOfLegs;
    public Mammal(String colour, Integer legs){
        super(colour);
        numberOfLegs = legs;
    }
}

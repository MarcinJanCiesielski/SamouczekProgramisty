package com.marcinjc.dziedziczenie;

import com.marcinjc.porownywanieobiektow.Human;

public abstract class Mammal extends Animal {
    int numberOfLegs;
    public Mammal(String colour, int legs){
        super(colour);
        numberOfLegs = legs;
    }

    public abstract boolean equals(Human otherHuman);
}

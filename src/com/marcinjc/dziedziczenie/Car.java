package com.marcinjc.dziedziczenie;

import com.marcinjc.obiektypakiety.Engine;

public class Car extends Vehicle {
    public static final int NUMBER_OF_WHEELS = 4;

    public Car (Engine engine) {
        super(engine, NUMBER_OF_WHEELS);
    }

    public void startEngine() {
        super.startEngine();
        System.out.println("Force driver to fasten seat belts.");
    }
}

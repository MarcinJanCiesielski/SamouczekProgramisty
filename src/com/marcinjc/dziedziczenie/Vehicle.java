package com.marcinjc.dziedziczenie;

import com.marcinjc.obiektypakiety.Engine;

public abstract class Vehicle {
    private int numberOfWheels;
    private Engine engine;

    public Vehicle(Engine engine, int numberOfWheels) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
    }

    public void startEngine() {
        System.out.println("Engine starts. Brum brum brum.");
    }
}

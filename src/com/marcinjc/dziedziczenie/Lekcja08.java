package com.marcinjc.dziedziczenie;

import com.marcinjc.obiektypakiety.Engine;

public class Lekcja08 {
    public static void main(String[] args) {
        Car car = new Car(new Engine());
        car.startEngine();
    }
}


package com.marcinjc.serializacja;

import com.marcinjc.serializacja.Engine;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    private Engine engine;
    private Tyre[] tyres;

    public Car(Engine engine, Tyre[] tyres) {
        this.engine = engine;
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre[] getTyres() {
        return tyres;
    }
}

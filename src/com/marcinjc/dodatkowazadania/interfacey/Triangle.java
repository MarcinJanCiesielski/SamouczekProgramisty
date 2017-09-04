package com.marcinjc.dodatkowazadania.interfacey;

public class Triangle implements Figure {
    private int a,b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return a+b+(Math.sqrt(Math.pow(a,2))+Math.pow(b,2));
    }

    @Override
    public double getArea() {
        return (a*b)/2.0F;
    }
}

package com.marcinjc.dodatkowazadania.interfacey;

public class Circle implements Figure {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }

}

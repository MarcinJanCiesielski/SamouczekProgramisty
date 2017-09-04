package com.marcinjc.dodatkowazadania.obiekty;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int length, int width){
        this.width = width;
        this.length = length;
    }

    public int field(){
        return width*length;
    }

    public int circuit(){
        return 2 * (width+length);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width,2) + Math.pow(length,2));
    }
}

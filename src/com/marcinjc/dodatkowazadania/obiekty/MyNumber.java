package com.marcinjc.dodatkowazadania.obiekty;

public class MyNumber {

    private double number;

    public MyNumber(double number){
        this.number = number;
    }

    public boolean isEven(){
        return number % 2 == 0;
    }

    public boolean isOdd(){
        return number % 2 != 0;
    }

    public double square(){
        return Math.sqrt(number);
    }

    public MyNumber power(MyNumber x){
        return new MyNumber(Math.pow(number, x.number));
    }

    public MyNumber add(MyNumber x){
        return new MyNumber(number + x.number);
    }

    public MyNumber substract(MyNumber x){
        return new MyNumber(number - x.number);
    }
    @Override
    public String toString(){
        return String.valueOf(number);
    }

}

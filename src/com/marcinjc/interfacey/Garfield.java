package com.marcinjc.interfacey;

public class Garfield implements FatCat {
    public static void main(String[] args) {
        Garfield garfield = new Garfield();
        FatCat fatCat = new Garfield();
        Cat cat = new Garfield();
        LasagnaEater lasagnaEater = new Garfield();
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String getLasagnaRecipe() {
        return null;
    }


}

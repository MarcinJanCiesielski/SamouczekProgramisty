package com.marcinjc.typwyliczeniowy;

public class Tshirt {
    private SimpleTshirtSize size;
    private String manufacturer;

    public Tshirt(SimpleTshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(SimpleTshirtSize.L, "Polex");
        switch (tshirt.size) {
            case S:
                System.out.println("Kupiles koszulke w rozmiarze small");
                break;
            case M:
                System.out.println("Kupiles koszulke w rozmiarze medium");
                break;
            case L:
                System.out.println("Kupiles koszulke w rozmiarze large");
                break;
            case XL:
                System.out.println("Kupiles koszulke w rozmiarze extra large");
                break;
        }
    }
}

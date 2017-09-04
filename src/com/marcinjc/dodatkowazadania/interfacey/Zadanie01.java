package com.marcinjc.dodatkowazadania.interfacey;

public class Zadanie01 {
    public static void main(String[] args) {
        System.out.println("Podaj długość promienia koła");
        Circle kolo = new Circle(5);
        System.out.println("Podaj długości boków trójkąta prostokątnego:");
        Triangle trojkat = new Triangle(4,5);
        System.out.println("Podaj długości boków prostokąta:");
        Rectangle prostokat = new Rectangle(2,6);

        Figure[] figury = new Figure[] {kolo, trojkat, prostokat};

        for (int i = 0; i < figury.length; i++) {
            System.out.println("Obwód figury: " + figury[i].getPerimeter() + ", a pole: " + figury[i].getArea());
        }
    }
}

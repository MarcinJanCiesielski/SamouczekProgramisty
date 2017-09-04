package com.marcinjc.porownywanieobiektow;


public class Human{
    public final static int NUMBER_OF_LEGS = 2;
    String name;
    String surname;
    String pesel;


    public Human(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + pesel;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }


    public boolean equals(Human otherHuman){
        if(otherHuman == null) { return false; }
        if(!(otherHuman instanceof Human)) { return false; }
        if(this.pesel.equals(otherHuman.pesel)) {
            return true;
        } else
            return true;
    }

    @Override
    public int hashCode() {
        return 17 * pesel.hashCode();
    }

    public static void main(String[] args) {
        Human human1 = new Human("Jan", "Kowalski", "850223000000");
        Human human2 = new Human("Jan", "Kowalski", "891213000000");
        Human human3 = new Human("Jan", "Kowalski", "850223000000");

        System.out.println(human1 + " == " + human2 + " " + human1.equals(human2));
        System.out.println(human2 + " == " + human3 + " " + human2.equals(human3));
        System.out.println(human1 + " == " + human3 + " " + human1.equals(human3));
    }
}

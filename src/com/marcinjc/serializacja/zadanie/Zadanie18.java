package com.marcinjc.serializacja.zadanie;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.text.DateFormat;
import java.util.*;

public class Zadanie18 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        zadanie02();
    }

    public static void zadanie01() throws IOException, ClassNotFoundException {
        String imie = "";
        Set<String> imiona = new HashSet<>();
        int ilosc = 0;
        System.out.println("Aby zakończyć podawanie imion wpisz >>-<< (myślnik)");
        while(!imie.equals("-")){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj imię: ");
            if (scanner.hasNext()){
                imie = scanner.next();
                if (!imie.equals("-")){
                    imiona.add(imie);
                    ilosc++;
                }
            }
        }
        zapiszImionaXml(imiona);
        odczytajImionaXml();
    }
    public static void zapiszImiona(Set<String> imiona) throws IOException{
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new  FileOutputStream("list.bin"))) {
            outputStream.writeObject(imiona);
        }
    }

    public static void zapiszImionaXml(Set<String> imiona) throws FileNotFoundException {
        try(XMLEncoder xmlEncoder = new XMLEncoder((new FileOutputStream("imiona.xml")))){
            xmlEncoder.writeObject(imiona);
        }
    }
    public static void odczytajImiona() throws IOException, ClassNotFoundException {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("list.bin"))){
            Set<String> imiona = (HashSet<String>) inputStream.readObject();
            for (String imie: imiona) {
                System.out.println(imie);
            }
        }
    }
    public static void odczytajImionaXml () throws FileNotFoundException {
        try(XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("imiona.xml"))){
            Set<String> imiona = (HashSet<String>) xmlDecoder.readObject();
            for(String imie: imiona) {
                System.out.println(imie);
            }
        }
    }

    private static void zadanie02() throws IOException, ClassNotFoundException {
        Calendar date = Calendar.getInstance();
        date.set(1979, 1, 1);

        Human czlowiek = new Human("Marcin", date);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("human.bin"))){
            outputStream.writeObject(czlowiek);
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("human.bin"))){
            Human czlowiek2 = (Human) inputStream.readObject();
            System.out.println(czlowiek2);
        }
    }
}

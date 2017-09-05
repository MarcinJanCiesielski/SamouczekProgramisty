package com.marcinjc.kolekcje;

import java.util.*;

public class Zadanie15 {

    public static void main(String[] args) {
        zadanie02();
    }

    public static void zadanie01(){
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
        System.out.println("Podałeś " + ilosc + " imion, w tym " + imiona.size() + " unilanych");
    }

    public static void zadanie02(){
        Map<String,String> mapaImion = new HashMap<String, String>();

        String imie1 ="", imie2 = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aby zakończyć podawanie imion wpisz >>-<< (myślnik)");
        while(true){
            System.out.print("Podaj pierwsze imię dla pary: ");
            if (scanner.hasNext()){
                imie1 = scanner.next();
                if (!imie1.equals("-")){
                } else {
                    break;
                }
            }
            System.out.print("Podaj drugie imię dla pary: ");
            if (scanner.hasNext()){
                imie2 = scanner.next();
                if (!imie2.equals("-")){
                    mapaImion.put(imie1,imie2);
                } else {
                    break;
                }
            }
        }
        System.out.print("Podaj imię osoby dla której chcesz znaleźć partnera: ");
        if (scanner.hasNext()) {
            imie1 = scanner.next();
            if(mapaImion.containsKey(imie1)){
                System.out.println("Imię odpowiadojące podanemu przez Ciebie to: " + mapaImion.get(imie1));
            }
        }
    }
}

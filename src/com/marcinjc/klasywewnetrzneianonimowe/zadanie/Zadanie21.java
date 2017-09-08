package com.marcinjc.klasywewnetrzneianonimowe.zadanie;

import java.util.*;

public class Zadanie21 {
    public static void main(String[] args) {
        List<String> lista = askForList();
        System.out.println("Lista przed sortowaniem pod względem długości");
        for (String wpis: lista){
            System.out.println(wpis);
        }
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println("\nLista po sortowaniem pod względem długości");
        for (String wpis: lista){
            System.out.println(wpis);
        }
    }

    public static List<String> askForList() {
        List<String> lista = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pięć wpisów!");

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj wpis: ");
            String wpis = scanner.next();
            lista.add(wpis);
        }
        return lista;
    }
}

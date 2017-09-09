package com.marcinjc.lambda.zadanie;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class Zadanie22 {

    public static void main(String[] args) {
        zadanie02();
    }

    public static void zadanie01(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj 4 wpisy");
        List<String> lista = new LinkedList<String>();
        for (int i = 0; i < 4; i++) {
            System.out.print("Podaj wpis: ");
            lista.add(scaner.next());
        }

        lista.sort((a, b) -> b.length() - a.length());

        for(String wpis: lista){
            System.out.println(wpis);
        }
    }

    public static void zadanie02(){
        ToIntFunction<Object> hashMeth = Object::hashCode;
        Object object = new Object();

        System.out.println(hashMeth.applyAsInt(object));
    }

    public static void zadanie03(){
        BiFunction<Integer, String, Human> humanConstructor = Human::new;
        Human human = humanConstructor.apply(25, "Zenek");
        System.out.println(human.getAge());
        System.out.println(human.getName());
    }
}

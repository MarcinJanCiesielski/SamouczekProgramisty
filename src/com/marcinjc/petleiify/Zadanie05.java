package com.marcinjc.petleiify;

public class Zadanie05 {

    public static void main(String[] args) {
        //Zadanie09 4
        System.out.println("Zadanie09 4");
        int number4 = -10;
        while(number4<=40){
            if(number4 % 2 != 0){
                System.out.println(number4);
            }
            number4++;
        }
        //Zadanie09 3
        System.out.println("Zadanie09 3");
        int number3 = -10;
        for(;number3<=40; number3++){
            if(number3 % 2 != 0) {
                System.out.println(number3);
            }
        }

        //Zadanie09 2
        System.out.println("Zadanie09 2");
        int number2 = 10;
        while(number2<=20){
            System.out.println(number2);
            number2++;
        }

        // Zadanie09 1
        System.out.println("Zadanie09 1");
        for (int i = 20; i >=10; i--) {
            System.out.println(i);
        }

    }
}

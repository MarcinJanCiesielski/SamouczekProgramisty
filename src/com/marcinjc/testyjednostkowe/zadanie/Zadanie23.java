package com.marcinjc.testyjednostkowe.zadanie;

import com.marcinjc.testyjednostkowe.zadanie.Basket;

public class Zadanie23 {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Product nullProduct;
        String nullName = null;
//        Product product1 = new Product("Sól", 3);
//        Product product2 = new Product("Masło", 7);
//        basket.addProduct(product1, 3);
//        basket.addProduct(product2,2);
        nullProduct = new Product(nullName,1.0);

        System.out.println(basket.getCost());
        System.out.println(basket.toString());
    }

}

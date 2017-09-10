package com.marcinjc.testyjednostkowe.zadanie;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    Map<Product, Integer> products;

    public Basket(){products= new HashMap<Product,Integer>();}

    public Basket(Product product, Integer amount){
        products= new HashMap<Product,Integer>();
        if(amount>0) {
            products.put(product, amount);
        }
    }
    public Basket(Product product){
        products= new HashMap<Product,Integer>();
            products.put(product, 1);
    }

    public void addProduct(Product product, Integer amount){
        if(product == null){
            throw new NullPointerException("Brak produktu do dodania");
        }
        if (amount>0) {
            if(products.containsKey(product)){
                int ilosc = products.get(product) + amount;
                products.put(product, ilosc);
            } else {
                products.put(product, amount);
            }
        }
        if(amount == 0){
            return;
        }
    }

    public void removeProduct(Product product){
        if(product == null){
            throw new NullPointerException("Brak produktu do usunięcia");
        }

        if(!products.isEmpty() && products.containsKey(product)){
            products.remove(product);
        }
    }

    public void removeProduct(Product product, Integer amount){
        if(products.containsKey(product)){
            Integer ilosc = products.get(product);
            if(ilosc-amount<=0){
                removeProduct(product);
            } else {
                products.put(product, ilosc-amount);
            }
        }
    }

    public boolean isEmpty(){
        return products.isEmpty();
    }

    @Override
    public String toString() {
        String basket ="";
        for (Map.Entry<Product,Integer> entry: products.entrySet()) {
            Product product = entry.getKey();
            Integer amount = entry.getValue();
            basket += product.nazwa + " - cena: " + product.cena + ", ilość: " + amount + " - Koszt: " + (product.cena * amount) + "\n";
        }
        return basket;
    }

    public double getCost(){
        double cost=0;
        for (Map.Entry<Product,Integer> entry: products.entrySet()) {
            Product product = entry.getKey();
            Integer amount = entry.getValue();
            cost += product.getCena() * amount;
        }
        return cost;
    }
}

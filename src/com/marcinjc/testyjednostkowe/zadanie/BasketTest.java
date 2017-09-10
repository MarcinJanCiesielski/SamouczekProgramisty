package com.marcinjc.testyjednostkowe.zadanie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    Basket basket;
    Product nullProduct = null;
    Product properProduct;
    Integer propoerAmount = 1;

    @Before
    public void setUp(){
        basket = new Basket();
        properProduct = new Product("Kasza", 2.0);
    }

    @Test
    public void shouldHaveProperExceptionMessageAdding() {
        try{
            basket.addProduct(nullProduct, 2);
            fail("NullPointerException should be thrown!");
        } catch (NullPointerException e){
            assertEquals("Brak produktu do dodania", e.getMessage());
        }
    }

    @Test
    public void shouldHaveProperExceptionMessageRemoving() {
        try{
            basket.removeProduct(nullProduct);
            fail("NullPointerException should be thrown!");
        } catch (NullPointerException e){
            assertEquals("Brak produktu do usunięcia", e.getMessage());
        }
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionAdding(){
        basket.addProduct(nullProduct,2);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionRemoving(){
        basket.removeProduct(nullProduct);
    }

    @Test
    public void shouldReturnCostEqaulsTo2(){
        basket.addProduct(properProduct,propoerAmount);
        assertTrue(Math.abs(2.0-basket.getCost())<0.0001);
    }

    @Test
    public void shouldReturnProperStringValue(){
        basket.addProduct(properProduct,propoerAmount);
        assertEquals("Kasza - cena: 2.0, ilość: 1 - Koszt: 2.0\n", basket.toString());
    }

    @Test
    public void shouldSayBasketIsEmpty(){
        basket.addProduct(properProduct,propoerAmount);
        basket.removeProduct(properProduct);
        assertTrue(basket.isEmpty());
    }
}
package com.marcinjc.testyjednostkowe.zadanie;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class ProductTest {
    Product product;
    String nullName = null;

    @Before
    public void setUp(){

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException(){
            product = new Product(nullName, 2.0);
    }

    @Test
    public void shouldSayThatBothProductAreEqual(){
        Product product1 = new Product("Product", 2.0);
        Product product2 = new Product("Product", 2.0);
        assertTrue(product1.equals(product2));
    }
    @Test
    public void shouldSayThatBothProductAreNotEqualName(){
        Product product1 = new Product("Product1", 2.0);
        Product product2 = new Product("Product2", 2.0);
        assertFalse(product1.equals(product2));
    }

    @Test
    public void shouldSayThatBothProductAreNotEqualPrice(){
        Product product1 = new Product("Product", 2.01);
        Product product2 = new Product("Product", 2.02);
        assertFalse(product1.equals(product2));
    }
}

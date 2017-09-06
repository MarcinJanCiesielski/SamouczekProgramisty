package com.marcinjc.trywithresouces;

public class Zadanie17 {
    public static void main(String[] args) {
        try(
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em");
        ) {
            em.body("Tekst do wyświetlenia");
        }
    }
}

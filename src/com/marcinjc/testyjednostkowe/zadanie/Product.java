package com.marcinjc.testyjednostkowe.zadanie;

class Product {
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    String nazwa;
    double cena;

    public Product(String nazwa, double cena) {
        if(nazwa==null ){
            throw new IllegalArgumentException("Brak nazwy dla wyrobu");
        }
        this.nazwa = nazwa;
        if(cena<0){
            this.cena = cena * (-1);
        } else {
            this.cena = cena;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.cena, cena) != 0) return false;
        return nazwa.equals(product.nazwa);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nazwa.hashCode();
        temp = Double.doubleToLongBits(cena);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

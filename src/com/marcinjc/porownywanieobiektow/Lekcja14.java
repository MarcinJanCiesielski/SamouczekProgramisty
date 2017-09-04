package com.marcinjc.porownywanieobiektow;

public class Lekcja14 {

    public static void main(String[] args) {
        System.out.println("10 == 10: " + (10 == 10));
        System.out.println("10 != 10: " + (10 != 10));
        System.out.println("true == true: " + (true == true));
        System.out.println("true != true: " + (true != true));
        System.out.println("'a' == 'a': " + ('a' == 'a'));
        System.out.println("'a' != 'a': " + ('a' != 'a'));
        System.out.println("500L == 500L: " + (500L == 500L));
        System.out.println("500L != 500L: " + (500L != 500L));

        System.out.println("");
        System.out.println("");

        System.out.println("0.3 == 0.1 + 0.2: " + (0.3 == 0.1 + 0.2)); // !!!
        System.out.println("0.3 == 0.1 + 0.2: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.000001));

        System.out.println("");
        System.out.println("");

        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + new String("test").equals(new String("test")));

        System.out.println("");
        System.out.println("");


        String reference1 = new String("something");
        String reference2 = reference1;
        System.out.println("reference1 == reference2: " + (reference1 == reference2));

        class Chair {
            private String model;
            private String manufacturer;
            private int productionYear;

            public Chair(String model, String manufacturer, int productionYear) {
                this.model = model;
                this.manufacturer = manufacturer;
                this.productionYear = productionYear;
            }

            public String getModel() {
                return model;
            }

            public String getManufacturer() {
                return manufacturer;
            }

            public int getProductionYear() {
                return productionYear;
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null) {
                    return false;
                }
                if (obj instanceof Chair) {
                    Chair otherChair = (Chair) obj;
                    return model.equals(otherChair.model) &&
                            manufacturer.equals(otherChair.manufacturer) &&
                            productionYear == otherChair.productionYear;
                }
                return false;
            }

            @Override
            public int hashCode() {
                return model.hashCode() + manufacturer.hashCode() + productionYear;
            }
        }

        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janinge", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);

        System.out.println("chair1.equals(chair2): " + chair1.equals(chair2));
        System.out.println("chair1.equals(chair3): " + chair1.equals(chair3));
        System.out.println("chair1.equals(chair4): " + chair1.equals(chair4));
        System.out.println("chair1.equals(null): " + chair1.equals(null));
    }

}

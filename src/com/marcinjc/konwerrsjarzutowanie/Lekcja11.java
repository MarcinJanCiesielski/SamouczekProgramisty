package com.marcinjc.konwerrsjarzutowanie;

public class Lekcja11 {
    public static void main(String[] args) {
        convert();
    }
    public static void differentTypes() {
        Object objectInstance = new Object();
        Object stringInstance = "string";

        String realString = (String) stringInstance;
        realString.length();
    }

    public static void wrongCast(){
        Object[] someMysteriousObjects = new Object[] {"1234", new Object()};

        String castedString = (String) someMysteriousObjects[0];
        String classCastException = (String) someMysteriousObjects[1];
    }

    public static void nonPublicConversion(){
        int intVariable = Integer.MAX_VALUE;
        long longVariable = Long.MAX_VALUE;

        methodLongArgument(longVariable);
        methodLongArgument(intVariable); // extending conversion
    }

    public static void methodLongArgument(long argument) {
        System.out.println(argument);
    }

    public static void publicConversion(){
    int intVariable = Integer.MAX_VALUE;
    long longVariable = Long.MAX_VALUE;
    long longVariableWithoutLoosingInformation = Integer.MAX_VALUE; // automatic conversion from int to long

        methodIntArgument(intVariable);
        methodIntArgument((int) longVariable);
        methodIntArgument((int) longVariableWithoutLoosingInformation);
    }

    public static void methodIntArgument(int argument) {
        System.out.println(argument);
    }

    public static void convert(){
        int intValue1 = (int) 123.123F;
        long longValue1 = (long) 456.756;

        System.out.println(intValue1);
        System.out.println(longValue1);

        long longValue2 = 123;
        int intValue2 = (short) 123;
        float floatValue2 = 12.12F;
        double doubleValue2 = floatValue2;

        System.out.println(longValue2);
        System.out.println(intValue2);
        System.out.println(floatValue2);
        System.out.println(doubleValue2);


        short shortValue = 1;
        int intValue = 1;
        long longValue = 2;
        float floatValue = 3.1F;
        double doubleValue = 4.1;

        System.out.println(intValue + doubleValue);
        System.out.println(intValue + floatValue);
        System.out.println(intValue + longValue);
        System.out.println(shortValue + shortValue);
        System.out.println("Wynik: " + (5/2F));
    }
}

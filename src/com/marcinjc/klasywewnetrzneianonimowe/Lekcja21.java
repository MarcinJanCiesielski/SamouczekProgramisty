package com.marcinjc.klasywewnetrzneianonimowe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lekcja21 {
    public static void main(String[] args) {
        innerClassInstantiation();
        staticInnerClassInstantiation();
        localClassInstantiation(args);
        mapIterationExampe();
        someMethod();
    }

    private static void mapIterationExampe() {
        Map<String, Integer> dayInMonths = new HashMap<>();
        dayInMonths.put("styczen", 31);
        dayInMonths.put("luty", 28);
        dayInMonths.put("marzec", 31);

        for(Map.Entry<String, Integer> entry : dayInMonths.entrySet()) {
            System.out.println(entry.getKey() + " ma " + entry.getValue() + " dni.");
        }
    }

    private static void localClassInstantiation(String[] args) {
        class LocalClass {
            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }
        LocalClass localClassInstance = new LocalClass();
        System.out.println(localClassInstance);
    }

    private static void innerClassInstantiation() {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass instance1 = outerClass.intantiate();
        OuterClass.InnerClass instance2 = outerClass.new InnerClass();
    }

    private static void staticInnerClassInstantiation() {
        OuterClass2 outerClass = new OuterClass2();
        OuterClass2.InnerClass2 instance1 = outerClass.instantiate();
        OuterClass2.InnerClass2 instance2 = new OuterClass2.InnerClass2();
    }

    public static void someMethod() {
        final String finalVariable = "final variable";
        String effectivelyFinalVariable = "effectively final variable";
        String nonFinalVariable = "non final variable";

        class InnerClass {
            public void saySomething() {
                System.out.println(finalVariable);
                System.out.println(effectivelyFinalVariable);
            }
        }

        InnerClass instance = new InnerClass();
        instance.saySomething();

        nonFinalVariable = "new value";
    }
}

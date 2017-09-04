package com.marcinjc.funkcje;

public class TemperatureCheck {
    public static void main(String[] args) {
        int positiveTemperature = 10;
        int negativeTemperature = -10;

        isTemperaturePositive(positiveTemperature);
        isTemperaturePositive(negativeTemperature);
    }

    private static void isTemperaturePositive(double temperature) {
        if (temperature >= 0) {
            System.out.println("Temperatura: " + temperature + " jest dodatnia");
        } else {
            System.out.println("Temperatura: " + temperature + " jest ujemna");
        }
    }
}
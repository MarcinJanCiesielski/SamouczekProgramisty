package com.marcinjc.formatowanielancuchowznakow.zadanie;

import java.io.*;
import java.util.Locale;
import java.util.regex.Pattern;

public class ZadanieFormatter {

    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader inputStream = new BufferedReader(new FileReader("test.csv"));
        Pattern pattern = Pattern.compile("(//w+),(//d+),(//w+)");

        while((line = inputStream.readLine()) != null) {

            String[] parts = line.split(",");
            System.out.format(Locale.US,"|%-9s|%8.2f|%13s|%n", parts[0], new Float(parts[1]), parts[2]);
        }
    }
}

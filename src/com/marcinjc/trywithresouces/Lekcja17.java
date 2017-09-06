package com.marcinjc.trywithresouces;

import java.io.*;

public class Lekcja17 {
    public static void main(String[] args) {

    }

    public static void classicTry(){
        String inputPath = "C:\\file.txt";
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(inputPath));
            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void tryWithResorces1(){
        String inputPath = "C:\\file.txt";
        try(BufferedReader fileReader = new BufferedReader(new FileReader(inputPath))) {
            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void tryWithResorces2() throws IOException {
        String inputPath = "C:\\file.txt";
        String outputPath = "C:\\file.txt";

        try(
                BufferedReader fileReader = new BufferedReader(new FileReader(inputPath));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputPath));
        ) {
            String line = fileReader.readLine();
            fileWriter.write(line);
        }
    }
}

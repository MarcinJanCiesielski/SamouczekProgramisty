package com.marcinjc.operacjenaplikach;

import java.io.*;
import java.util.Scanner;

public class Zadanie16 {

    public static void main(String[] args) {
        try {
            zadanie01();
            zadanie02();
            zadanie03();
            zadanie04();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void zadanie01() throws IOException {
        String filePath = null;
        String textLine = null;
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = null;
        boolean loopExit = false;

        System.out.print("Podaj ścieżkę do pliku: ");
        filePath = scanner.nextLine();

        try{
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            System.out.println("Aby zakończyć wisywanie tekstu podaj >>-<< jako argument!");
            while (!loopExit){
                System.out.print("Podaj tekst do zapisania do pliku: ");
                textLine = scanner.nextLine();
                loopExit = textLine.equals("-");
                if (!loopExit){
                    bufferedWriter.write(textLine + System.lineSeparator());
                }
            }

        } catch (IOException e) {
            System.out.println("Błędna ścieżka dostępu do pliku:!");
        } finally {
            if(bufferedWriter != null) {
                bufferedWriter.close();
            }
        }

    }

    public static void zadanie02() throws IOException {
        BufferedReader bufferedReader = null;
        String filePath = null;
        Scanner scanner = new Scanner(System.in);
        int lines=0;

        try {
            System.out.print("Podaj ścieżkę do pliku: ");
            filePath = scanner.nextLine();
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String textLine;
            System.out.println("Poniżej zostanie wyświetlona zapartość pliku:");
            while((textLine = bufferedReader.readLine()) != null){
                System.out.println(textLine);
                lines++;
            }
            System.out.println("Plik zawiera " + lines + " linie");
        } catch (IOException e) {
            System.out.println("Błędna ścieżka dostępu do pliku:!");
        } finally {
            if(bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }

    public static void zadanie03() throws IOException {
        DataOutputStream  outputStream = null;
        Scanner scanner = new Scanner(System.in);
        int day, month, year;
        String filePath = "D:\\birtday.txt";
        try{
            outputStream = new DataOutputStream(new FileOutputStream(filePath));
            System.out.print("Podaj dzień urodzin: ");
            day = scanner.nextInt();
            outputStream.writeInt(day);
            System.out.print("Podaj miesiąc urodzin: ");
            month = scanner.nextInt();
            outputStream.writeInt(month);
            System.out.print("Podaj rok urodzin: ");
            year = scanner.nextInt();
            outputStream.writeInt(year);

        } catch (IOException e){
            System.out.println("Błędna ścieżka dostępu do pliku:!");
        } finally {
            if(outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static void zadanie04() throws IOException {
        DataInputStream inputStream = null;
        int day, month, year;
        String filePath = "D:\\birtday.txt";
        try{
            inputStream = new DataInputStream(new FileInputStream(filePath));
            day = inputStream.readInt();
            month = inputStream.readInt();
            year = inputStream.readInt();
            System.out.println("Data urodzin to (dzień-miesiąc-rok): " + day + "-" + month +"-" + year);

        } catch (IOException e) {
            System.out.println("Błędna ścieżka dostępu do pliku:!");
    } finally {
        if(inputStream != null) {
            inputStream.close();
        }
    }
    }


}

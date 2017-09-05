package com.marcinjc.operacjenaplikach;

import java.io.*;

public class Lekcja16 {
    //BufferedReader fileBuffReader1 = new BufferedReader(new FileReader(new File("/path/to/text/file.txt")));

    //BufferedReader fileBuffReader2 = new BufferedReader(new FileReader("/path/to/text/file.txt"));

    public Lekcja16() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {

        readBinaryFile();

    }

    public static void writeTextFile() throws IOException{
        String filePath = "D:\\textFile.txt";
        int number = 1234567;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(Integer.toString(number));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    public static void readTextFile() throws IOException {
        String filePath = "D:\\textFile.txt";
        int number = 0;
        BufferedReader fileReader = null;

        try{
            fileReader = new BufferedReader(new FileReader(filePath));
            number = Integer.parseInt(fileReader.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }

    public static void writeBinaryFile() throws IOException {
        String filePath = "D:\\binaryFile.txt";
        int number = 1234567;
        DataOutputStream outputStream = null;

        try {
            outputStream = new DataOutputStream(new FileOutputStream(filePath));
            outputStream.writeInt(number);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static void readBinaryFile() throws IOException {
        String filePath = "D:\\binaryFile.txt";
        int number = 0;

        DataInputStream inputStream = null;

        try{
            inputStream = new DataInputStream(new FileInputStream(filePath));
            number = inputStream.readInt();
            System.out.println(number);
        } finally {
            if(inputStream != null) {
                inputStream.close();
            }
        }
    }

}

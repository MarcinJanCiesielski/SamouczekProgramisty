package com.marcinjc.serializacja.zadanie;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Human implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    Calendar dateOfBirth;
    private transient int age;

    public Human(String name, Calendar dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge();
    }

    public Human(){}

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.writeUTF(name);
        outputStream.writeObject(dateOfBirth);
    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        name = inputStream.readUTF();
        dateOfBirth = (Calendar) inputStream.readObject();
        age = calculateAge();
    }

    public int calculateAge(){
        int age = Calendar.getInstance().get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        return age;
    }
    @Override
    public String toString(){
        return name + "; " + dateOfBirth.get(Calendar.YEAR)+"-"
                +dateOfBirth.get(Calendar.MONTH)+"-"
                +dateOfBirth.get(Calendar.DATE) + "; " + age;
    }
}

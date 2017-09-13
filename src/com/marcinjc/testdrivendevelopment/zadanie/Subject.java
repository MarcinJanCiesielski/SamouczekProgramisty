package com.marcinjc.testdrivendevelopment.zadanie;

public class Subject {
    String subjectName;

    public Subject(String subjectName){
        if(subjectName.equals(null)){
            throw new NullPointerException();
        }
        if(subjectName.length()==0) {
            throw new IllegalArgumentException("You must enter proper subject's name");
        }
        this.subjectName = subjectName;
    }
}

package com.marcinjc.testdrivendevelopment.zadanie;

public class GradeBook {
    String pupilName;

    public GradeBook(String pupilName){
        if(pupilName.equals(null)){
            throw new NullPointerException();
        }
        if(pupilName.length()==0){
            throw new IllegalArgumentException("You must enter proper pupil's name");
        }
        this.pupilName = pupilName;
    }
}

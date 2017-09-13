package com.marcinjc.testdrivendevelopment.zadanie;

import java.util.HashSet;
import java.util.Set;

public class GradeBook {
    String pupilName;
    Set<Subject> subjects;


    public GradeBook(String pupilName){
        if(pupilName.equals(null)){
            throw new NullPointerException();
        }
        if(pupilName.length()==0){
            throw new IllegalArgumentException("You must enter proper pupil's name");
        }
        this.pupilName = pupilName;
        subjects = new HashSet<Subject>();
    }

    public void addSubject(Subject subject){
        if(subjects.contains(subject)){
            throw new IllegalArgumentException("The subject has already exist in  GradeBook!");
        }
        if(subject instanceof Subject){
           subjects.add(subject);
        }
    }

    public double calculateGradeBookAverage(){
        Integer sumOfGrades = 0;
        int numberOfGrades = 0;
        for(Subject subject: subjects){
            for(Integer grade: subject.grades){
                sumOfGrades += grade;
                numberOfGrades++;
            }
        }
        return (1.0 *sumOfGrades) / numberOfGrades;
    }

}

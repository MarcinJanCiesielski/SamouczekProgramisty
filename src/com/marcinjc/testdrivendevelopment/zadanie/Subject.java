package com.marcinjc.testdrivendevelopment.zadanie;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    String subjectName;
    Set<Integer> grades;

    public Subject(String subjectName){
        if(subjectName.equals(null)){
            throw new NullPointerException();
        }
        if(subjectName.length()==0) {
            throw new IllegalArgumentException("You must enter proper subject's name");
        }
        this.subjectName = subjectName;
        grades = new HashSet<Integer>();
    }

    public void addGrade(Integer grade){
        if(grade <=0 || grade > 6){
            throw new IllegalArgumentException("You can add only 1,2,3,4,5,6 grades!");
        } else {
            grades.add(grade);
        }
    }
}

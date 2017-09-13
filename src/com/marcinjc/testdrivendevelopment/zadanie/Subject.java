package com.marcinjc.testdrivendevelopment.zadanie;

import java.util.*;

public class Subject {
    String subjectName;
    List<Integer> grades;

    public Subject(String subjectName){
        if(subjectName.equals(null)){
            throw new NullPointerException();
        }
        if(subjectName.length()==0) {
            throw new IllegalArgumentException("You must enter proper subject's name");
        }
        this.subjectName = subjectName;
        grades = new ArrayList<Integer>();
    }

    public void addGrade(Integer grade){
        if(grade <=0 || grade > 6){
            throw new IllegalArgumentException("You can add only 1,2,3,4,5,6 grades!");
        } else {
            grades.add(grade);
        }
    }

    public double calculateGradesAverage(){
        Integer sum = 0;
        for (Integer grade: grades) {
            sum += grade;
        }
        return (1.0 * sum) / grades.size();
    }
}

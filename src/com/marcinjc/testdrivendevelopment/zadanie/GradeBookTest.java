package com.marcinjc.testdrivendevelopment.zadanie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GradeBookTest {

    @Test
    public void constructor_properPupilsName_ReturnsInstanceOfGradeBook() {
        GradeBook gb = new GradeBook("Marcin Ciesielski");
        assertTrue(gb instanceof GradeBook);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_emptyPupilsName_throwsIllegalAgrumenException(){
        GradeBook gb = new GradeBook("");
    }

    @Test (expected = NullPointerException.class)
    public void constructor_nullPupilsName_throwsNullPointerException(){
        String pupilName = null;
        GradeBook gb = new GradeBook(pupilName);
    }

    @Test
    public void addSubject_properSubject_returnOneSubjectInGradeBook(){
        int NUMBER_OF_SUBJECTS = 1;
        GradeBook gb = new GradeBook("Marcin Ciesielski");
        Subject subject = new Subject("English");
        gb.addSubject(subject);
        assertEquals(gb.subjects.size(),NUMBER_OF_SUBJECTS);
    }

    @Test
    public void addSubject_nullSubject_returnZeroSubjectInGradeBook(){
        int NUMBER_OF_SUBJECTS = 0;
        GradeBook gb = new GradeBook("Marcin Ciesielski");
        Subject subject = null;
        gb.addSubject(subject);
        assertEquals(gb.subjects.size(),NUMBER_OF_SUBJECTS);
    }

    @Test (expected = IllegalArgumentException.class)
    public void addSubject_addSubjectWhichAlreadyIsInGradeBook_throwsIllegalArgumentException(){
        int NUMBER_OF_SUBJECTS = 1;
        GradeBook gb = new GradeBook("Marcin Ciesielski");
        Subject subject1 = new Subject("English");
        subject1.addGrade(5);
        gb.addSubject(subject1);

        Subject subject2 = new Subject("English");
        gb.addSubject(subject2);
    }

    @Test
    public void calculateGradeBookAverage_twoSubjectsWithFiveGrades_returnsPropoerAverage(){
        final Integer grade1 = 3;
        final Integer grade2 = 6;
        final Integer grade3 = 4;
        final double average = 4.0;

        final long NUMBERS_OF_GRADES = 1;
        Subject subject1 = new Subject("English");
        subject1.addGrade(grade1);
        subject1.addGrade(grade2);
        subject1.addGrade(grade3);

        Subject subject2 = new Subject("Math");
        subject2.addGrade(grade1);
        subject2.addGrade(grade3);

        GradeBook gb = new GradeBook("Marcin Ciesielski");
        gb.addSubject(subject1);
        gb.addSubject(subject2);


        double avg = gb.calculateGradeBookAverage();

        assertTrue(Math.abs(avg - average) < 0.00001);
    }
}

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

    @Test
    public void addSubject_addSubjectWhichAlreadyIsInGradeBook_returnsOldSubjectsSet(){

    }
}

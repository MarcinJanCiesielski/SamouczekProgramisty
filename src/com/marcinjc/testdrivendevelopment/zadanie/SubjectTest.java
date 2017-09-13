package com.marcinjc.testdrivendevelopment.zadanie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SubjectTest {

    @Test
    public void constructor_properSubjectName_ReturnsInstanceOfSubject() {
        Subject subject = new Subject("English");
        assertTrue(subject instanceof Subject);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_emptySubjectsName_throwsIllegalAgrumenException(){
        Subject subject = new Subject("");
    }

    @Test (expected = NullPointerException.class)
    public void constructor_nullSubjectName_throwsNullPointerException(){
        String subjectName = null;
        Subject subject = new Subject(subjectName);
    }

    @Test
    public void addGrade_properGrade_returnSubjekctWithAddedGrade(){
        final long NUMBERS_OF_GRADES = 1;
        Subject subject = new Subject("English");
        subject.addGrade(5);
        assertEquals(subject.grades.size(),NUMBERS_OF_GRADES);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addGrade_inproperGrade_throwsIllegalArgumentException(){
        final long NUMBERS_OF_GRADES = 0;
        Integer inpropperGrade = 7;
        Subject subject = new Subject("English");
        subject.addGrade(inpropperGrade);
        fail();
    }


}

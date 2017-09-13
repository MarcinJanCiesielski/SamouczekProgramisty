package com.marcinjc.testdrivendevelopment.zadanie;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

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
}

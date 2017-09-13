package com.marcinjc.testdrivendevelopment.zadanie;

import org.junit.Test;

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


}

package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharectorReplaceTest {
    CharectorReplace charectorReplace;
    @Before
    public void setUp() throws Exception {
     charectorReplace=new CharectorReplace();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenStringCharectorIsReplaced(){
        String expected="faity fry";
        String actualstring=charectorReplace.replaceCharector("daily dry");
        assertEquals(expected,actualstring);
    }
    @Test
    public void givenStringCharectorIsNotReplaced(){
        String expected="faity dry";
        String actualstring=charectorReplace.replaceCharector("daily dry");
        assertNotEquals(expected,actualstring);
    }
}
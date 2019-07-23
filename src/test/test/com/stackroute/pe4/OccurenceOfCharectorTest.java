package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceOfCharectorTest {
    OccurenceOfCharector occurenceOfCharector;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenStringShouldHaveOccurenceOfCharector() {
        int expectedValue=6;
        int actualValue=occurenceOfCharector.countOccurence("java is java is java is");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void givenStringShouldNotHaveOccurenceOfThatCharector() {
        int expectedValue=10;
        int actualValue=occurenceOfCharector.countOccurence("java is java is java is");
        assertNotEquals(expectedValue,actualValue);
    }

}
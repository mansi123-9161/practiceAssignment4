package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurenceOfCharectorTest {
    MultipleOccurenceOfCharector multipleOccurenceOfCharector;
    @Before
    public void setUp() {
        multipleOccurenceOfCharector=new MultipleOccurenceOfCharector();
    }
    @After
    public void TearDown(){

    }
    @Test
    public void givenStringArrayShouldReturnValidIndexValueOfCharector(){
        String expected="4-6 10-12 27-29";
        String actual=multipleOccurenceOfCharector.findOccuence("se","She sells seashells by the seashore");
        assertEquals(expected,actual);
    }
    @Test
    public void givenStringArrayShouldNotReturnValidIndexValueOfCharector(){
        String expected="4-4 10-12 27-29";
        String actual=multipleOccurenceOfCharector.findOccuence("se","She sells seashells by the seashore");
       assertNotEquals(expected,actual);
    }
    //@Test
    //public void givenStringArrayShouldBe
}
package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortParagraphTest {

    SortParagraph sortParagraph;
    @Before
    public void setUp() {
        sortParagraph=new SortParagraph();
    }
    @After
    public void TearDown(){

    }
    @Test
    public void givenParagraphArrayShouldReturnSortStringArray() {
        String[] expected={"and","dance","I","love","love","sing","to","to"};
        String[] actual=sortParagraph.paragraphSortArray("I love to dance and love to sing");


        assertArrayEquals(expected,actual);
    }
    @Test
    public void givenParagraphArrayShouldNotReturnSortStringArray() {
        String[] expected={"dance","and","I","love","love","sing","to","to"};
        String[] actual=sortParagraph.paragraphSortArray("I love to dance and love to sing");


        assertNotEquals(expected,actual);
    }
}
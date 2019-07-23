package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTransposeTest {
    CheckTranspose checkTranspose;
    @Before
    public void setUp() {
        checkTranspose=new CheckTranspose();
    }
    @After
    public void TearDown(){

    }
    @Test

    public void givenStringShouldReturnValidTranspose()  {

        String expected="a kciuq nworb xof spmuj revo eht yzal god";

        String string="a quick brown fox jumps over the lazy dog";
        String actual= checkTranspose.givenTranspose(string);
        assertEquals(expected,actual);
    }
    @Test

    public void givenStringShouldNotReturnValidTranspose()  {

        String expected="a quick nworb xof spmuj revo eht yzal god";

        String string="a quick brown fox jumps over the lazy dog";
        String actual= checkTranspose.givenTranspose(string);
        assertNotEquals(expected,actual);
    }
}
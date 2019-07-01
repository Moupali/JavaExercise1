package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleLoopTest {
    MultipleLoop obj = null;

    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @After
    public void tearDown() {

        System.out.println("After");
    }

    @Test
    public void givenNumberShouldReturnSeriesOfNumber1() {
        MultipleLoop obj = new MultipleLoop();
        //Act
        String result = obj.iteration(1);
        assertEquals("1", result);
    }

    @Test
    public void givenNumberShouldReturnSeriesOfNumber2() {
        MultipleLoop obj = new MultipleLoop();
        //Act
        String result = obj.iteration(5);
        assertEquals("122333444455555", result);
    }

    @Test
    public void givenStringShouldReturnNotAnAlphabet() {
        MultipleLoop obj = new MultipleLoop();
        //Act
        String result = obj.iteration(2);
        assertEquals("122", result);
    }
}


package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {


    GuessNumber obj=null;
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
    }
    @Test
    public void givenIntGreaterThanTarget()
    {
        GuessNumber obj=new  GuessNumber();
        //Act
        String result=obj.guess(67,34);
        assertEquals("The number guessed is greater than target ",result);
    }
    @Test
    public void givenIntLesserThanTarget()
    {
        GuessNumber obj=new  GuessNumber();
        //Act
        String result=obj. guess(22,34);
        assertEquals("The number guessed is lesser than target",result);
    }
    @Test
    public void givenIntEqualToTarget()
    {
        GuessNumber obj=new  GuessNumber();
        //Act
        String result=obj. guess(34,34);
        assertEquals("The number is equal to target",result);
    }

}



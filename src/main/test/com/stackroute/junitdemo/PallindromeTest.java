package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest {
    Pallindrome obj=null;
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
    public void givenStringShouldReturnPallindromeAndSumOfEvenNumberIsGreaterThan25()
    {
        Pallindrome obj=new Pallindrome();
        //Act
        String result=obj.findPallindrome(2468642);
        assertEquals("is pallindrome and sum of even numbers is greater than 25",result);
    }
    @Test
    public void givenStringShouldReturnPallindromeAndSumOfEvenNumberIsLesserThan25()
    {
        Pallindrome obj=new Pallindrome();
        //Act
        String result=obj.findPallindrome(12221);
        assertEquals("is pallindrome and sum of even numbers is less than 25",result);
    }
    @Test
    public void givenStringShouldReturnNotAnAlphabet()
    {
        Pallindrome obj=new Pallindrome();
        //Act
        String result=obj.findPallindrome(1231);
        assertEquals("is not pallindrome",result);
    }


}
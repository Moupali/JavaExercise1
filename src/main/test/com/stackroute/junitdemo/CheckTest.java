package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest
{

    Check obj=null;
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
    public void givenStringShouldReturnSmallLetter()
    {
        Check obj=new Check();
        //Act
        String result=obj.checking('n');
        assertEquals("Small Letter",result);
    }
    @Test
    public void givenStringShouldReturnCapitalLetter()
    {
        Check obj=new  Check();
        //Act
        String result=obj.checking('M');
        assertEquals("Capital Letter",result);
    }
    @Test
    public void givenStringShouldReturnDigit()
    {
        Check obj=new  Check();
        //Act
        String result=obj.checking('7');
        assertEquals("Digits",result);
    }
    @Test
    public void givenStringShouldReturnSpecialCharacter()
    {
        Check obj=new  Check();
        //Act
        String result=obj.checking('@');
        assertEquals("Special Character",result);
    }

}

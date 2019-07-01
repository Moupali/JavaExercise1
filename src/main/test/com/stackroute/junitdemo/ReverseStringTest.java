package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest
{
    ReverseString obj;
    @Before
    public void setUp() throws Exception
    {
        obj=new ReverseString();
    }
    @After
    public void tearDown()
    {

        obj=null;
    }
    @Test
    public void givenStringShouldBeReversed()
    {
        ReverseString obj=new ReverseString();
        //Act
        String result=obj.reversesoln("Hello");
        //Assert
        assertEquals("olleH",result);
    }
    @Test
    public void givenStringWithSpacesShouldReturnReverseString()
    {
        ReverseString obj=new ReverseString();
        //Act
        String result=obj.reversesoln("Hello World");

        //Assert
        assertEquals("dlroW olleH",result);
    }


}

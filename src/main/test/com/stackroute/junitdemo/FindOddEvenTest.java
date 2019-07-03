package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOddEvenTest
{

    FindOddEven obj=null;
    @Before
    public void setUp() throws Exception
    {
        obj=new FindOddEven();
    }
    @After
    public void tearDown() throws Exception
    {

        obj=null;
    }
    @Test
    public void givenEvenNumberShouldReturnJerry()
    {
        FindOddEven obj=new FindOddEven();
        //Act
        String result=obj.OddEven(28);
        //Assert
        assertEquals("Jerry",result);
    }
    @Test
    public void  givenOddNumberShouldReturnTom()
    {
        FindOddEven obj=new FindOddEven();
        //Act
        String result=obj.OddEven(21);


        assertEquals("Tom",result);
 }
    @Test
    public void  forGivenCharacter()
    {
        FindOddEven obj=new FindOddEven();
        //Act
        String result=obj.OddEven('a');


        assertEquals("Enter a valid Integer",result);
    }
    

}

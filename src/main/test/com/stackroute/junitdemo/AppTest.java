package com.stackroute.junitdemo;

import org.junit.*;
import org.junit.Test.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        app=new App();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        app=null;
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Before Class");
    }
    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("After Class");
    }

 @Test
 public void givenTwoStringShouldReturnConcatenateUpperString()
 {
     //arrange
     App app=new App();
     //Act
     String result=app.concatAndConvertString("Hello","World");

     //Assert
     assertEquals("HELLOWORLD",result);
 }
    @Test
    public void givenTwoNullShouldReturnErrorMessage()
    {

        //Act
        String result=app.concatAndConvertString(null,null);

        //Assert
        assertEquals("HELLOWORLD",result);
    }
    @Test
    public void givenOneNullShouldReturnErrorMessage()
    {

        //Act
        String result=app.concatAndConvertString("Hello",null);

        //Assert
        assertEquals("NullNotAllowed",result);
    }
    @Test
    public void givenOneEmptyStringOneNumericStringShouldReturnNumericString()
    {

        //Act
        String result=app.concatAndConvertString("","5");

        //Assert
        assertEquals("5",result);
    }

}
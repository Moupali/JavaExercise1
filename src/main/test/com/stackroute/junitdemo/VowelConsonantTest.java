package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class VowelConsonantTest {

    VowelConsonant obj=null;
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
    public void givenStringShouldReturnVowelConsonant()
    {
        VowelConsonant obj=new VowelConsonant();
        //Act
        String result=obj.checkVowelConsonant("ap",2);
        assertEquals("VowelConsonant",result);
    }
    @Test
    public void givenStringShouldReturnConsonantVowelVowel()
    {
        VowelConsonant obj=new VowelConsonant();
        //Act
        String result=obj.checkVowelConsonant("Mou",3);
        assertEquals("ConsonantVowelVowel",result);
    }
    @Test
    public void givenStringShouldReturnNotAnAlphabet()
    {
        VowelConsonant obj=new VowelConsonant();
        //Act
        String result=obj.checkVowelConsonant("M9u",3);
        assertEquals("ConsonantErrorVowel",result);
    }

}

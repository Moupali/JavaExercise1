package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingSumTest {
    SortingSum obj= new SortingSum();
    @Test
    public void testRun() {
        String output = obj.sortInput(12345);
        assertEquals("54321 and sum of even digits is less than 15", output);
    }

    @Test
    public void testRun1() {
        String output = obj.sortInput(2468642);
        assertEquals("8664422 and sum of even digits is greater than 15", output);
    }
}

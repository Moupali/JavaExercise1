/*4. Write a program using a loop to print the following output.
1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
6 6 . . . nth iteration.
Input: 5
Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
---------------------------------------*/
package com.stackroute.junitdemo;

public class MultipleLoop
{
    public static String iteration(int number)
    {
        String result = ""; //storing a null string

        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j <= i; j++)//loop for no. of times its going tp repeat
            {
                result = result + i;

            }
        }
        return result; //resulted string
    }
}
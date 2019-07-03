/*Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/

package com.stackroute.junitdemo;

public class FindOddEven {

    public static String OddEven(long num)
    {

        if (num % 2 != 0 && (num > 20 && num < 30))
        {
            return "Tom"; //checking for odd
        }
        else if (num % 2 == 0 && (num > 20 && num < 30))
        {
            return "Jerry"; //checking for even

        }
        else
            return "Number is not in 20-30 range"; //error message
    }
}

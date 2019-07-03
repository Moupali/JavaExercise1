/*8. Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
100) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
a. Number guessed is more than original number
b. Number guessed is less than original number
c. Number guessed matches the original number
-------------------------------------------------------------------------------------------------------------------------------*/


package com.stackroute.junitdemo;

public class GuessNumber {

    public static String guess(int num, int target) {

        String res;

        while (true) {
            if (num == target)  //if found
            {
                res = "The number is equal to target";

            }
            else if (num < target) //if lesser
            {
                res = "The number guessed is lesser than target";
            }
            else
                {
                res = "The number guessed is greater than target";

                }

            return res;
        }
    }
}
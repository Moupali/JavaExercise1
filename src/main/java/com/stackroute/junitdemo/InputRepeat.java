/*10. Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
repeat n number of times in the output String.
Input1: Stackroute
Input2: 5
Output1: Stackrouterouterouterouterouteroute*/

package com.stackroute.junitdemo;

public class InputRepeat
{
    public static String repeat(String input1,int input2)
    {

        //extracting the substring
        String substr = input1.substring(input1.length()-input2);

        for(int i=1; i<=input2; i++)
        {

            input1=input1 + substr;
        }

        //it will resturn the resulted string
        return input1;

    }
}

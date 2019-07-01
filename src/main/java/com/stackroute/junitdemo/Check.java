/*6. Write a program that takes a character from the user as input and determines whether the
character entered is a capital letter, a small case letter, a digit or a special symbol and display
appropriately.
Input: A
Output: Capital letter*/

package com.stackroute.junitdemo;
public class Check{

public static String checking(char ch)
        {
        if(ch>='A' && ch<='Z')
        return "Capital Letter";
        else if(ch>='a'  && ch<='z')
        return "Small Letter";
        else if(ch>='0' && ch<='9')
        return "Digits";
        else
        return "Special Character";
        }
        }


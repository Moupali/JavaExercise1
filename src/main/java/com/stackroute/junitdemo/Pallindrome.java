/*Write a program which accepts a number as input and check whether the given number is
palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions*/

package com.stackroute.junitdemo;

public class Pallindrome {
    public static String findPallindrome(int n)
    {
        int n1=n;
        int n2=n;
        String res;
        int r,r1,s=0,s1=0;
        while(n1>0)
        {
            r=n1%10;
            n1=n1/10;
            s=s*10+r;
        }
        if(s!=n)
        {
            res="is not pallindrome";
        }
        else {
            while (n2 > 0) {
                r1 = n2 % 10;
                if (r1 % 2 == 0) {
                    s1 = s1 + r1;
                }
                n2 = n2 / 10;

            }
            if (s1 > 25)
                res = "is pallindrome and sum of even numbers is greater than 25";
            else
                res = "is pallindrome and sum of even numbers is less than 25";
        }
            return res;

    }
}


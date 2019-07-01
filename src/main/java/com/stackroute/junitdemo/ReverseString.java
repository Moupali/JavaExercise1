package com.stackroute.junitdemo;

public class ReverseString {

    public  String reversesoln(String str)
    {
        int len=str.length();
        String rev="";
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        return rev;
    }
}

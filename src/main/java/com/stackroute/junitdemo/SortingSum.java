/*7. Write a program which accepts a number as input from user and perform the following:
        a. sort the number in non-increasing order
        b. after sorting sum all the even numbers, the sum should be greater than 15 .
        c. if sum is more than 15,then print output as true or false.
        Input : 234534
        Output : Sorted number in non-increasing order : 544332

        Sum of even numbers : 10
        False

        */
package com.stackroute.pe;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSum {
    public static void main(String[] args){
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        input = sc.nextInt();

        System.out.println(sortInput(input));
    }

    public static String sortInput(int input){
        String str = Integer.toString(input);
        int number;
        char temp[] = str.toCharArray();

        Arrays.sort(temp);

        number = Integer.parseInt(new String(temp));
        return(reverse(number) + checkSum(number));
    }

    public static int reverse(int num){
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    public static String checkSum(long num){
        long temp=0, rem;

        while (num>0){
            rem = num%10;
            num = num/10;

            if(rem%2 == 0)
                temp = temp + rem;
        }

        if(temp > 15)
            return (" and sum of even digits is greater than 15");
        else
            return (" and sum of even digits is less than 15");
    }
}




/*4. Write a program using a loop to print the following output.
1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
6 6 . . . nth iteration.
Input: 5
Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
---------------------------------------*/
package com.stackroute.junitdemo;
public class MultipleLoop {

    public static String iteration(int num) {
        String res = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                res = res + i;
                ;
            }
        }
        return res;
    }
}
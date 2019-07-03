/*3. Create a program that accepts a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter
Input : p
Output : Consonant
Input : ap
Output : Vowel Consonant (should it be a - vowel, p - consonant)*/

package com.stackroute.junitdemo;

public class VowelConsonant
{
    public static String checkVowelConsonant(String word,int length)
    {
        String result=""; ///storing a null string

        for (int i = 0; i < len; i++)
        {
            char ch = word.charAt(i);

            //checking vowels
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
                result=result+"Vowel";

            //checking error
            else if (ch >= 48 && ch <= 57)
                result=result+"Error";

            else
                result=result+"Consonant";//checking constant
        }
        return result;

    }
}

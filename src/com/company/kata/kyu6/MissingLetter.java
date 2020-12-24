package com.company.kata.kyu6;

/**
 * Find the missing letter
 * https://www.codewars.com/kata/5839edaa6754d6fec10000a2
 * 24-12-2020
 */

public class MissingLetter {
    public static char findMissingLetter(char[] array)
    {
        int count = (int)array[0];
        for(char ch : array){
            if( (int)ch == count ){
                count++;
            }
            else return (char)count;
        }
        return ' ';
    }
}

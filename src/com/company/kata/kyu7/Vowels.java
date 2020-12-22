package com.company.kata.kyu7;

/**
 * Vowel Count
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
 * 22-12-2020
 */

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for(char ch : str.toLowerCase().toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u')
            {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}

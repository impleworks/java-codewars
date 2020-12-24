package com.company.kata.kyu6;

import java.util.Arrays;

/**
 * Sum of Digits / Digital Root
 * https://www.codewars.com/kata/541c8630095125aba6000c00
 * 24-12-2020
 */

public class DRoot {
    public static int digital_root(int n) {
        int number = n, sum;
        while(number >= 10){
            char[] charDigits = String.valueOf(number).toCharArray();
            int[] intDigits = new int[charDigits.length];
            Arrays.setAll(intDigits, i -> Character.getNumericValue(charDigits[i]));
            sum = Arrays.stream(intDigits).sum();
            number = sum;
        }
        return number;
    }
}

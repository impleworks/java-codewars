package com.company.kata.kyu6;

/**
 * Tribonacci Sequence
 * https://www.codewars.com/kata/556deca17c58da83c00002db
 * 24-12-2020
 */

public class Xbonacci {
    // hackonacci me
    public static double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];
        for(int i = 0; i < result.length; i++){
            if(i <= 2) result[i] = s[i];
            else {
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            }
        }
        return result;
    }
}

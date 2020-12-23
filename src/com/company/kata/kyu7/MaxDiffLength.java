package com.company.kata.kyu7;

/**
 * Maximum Length Difference
 * https://www.codewars.com/kata/5663f5305102699bad000056
 * 24-12-2020
 */

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1.length == 0 || a2.length == 0) return -1;
        int maxValue = -1;
        for (String s1 : a1) {
            for (String s2 : a2) {
                int value = Math.abs(s1.length() - s2.length());
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }
}

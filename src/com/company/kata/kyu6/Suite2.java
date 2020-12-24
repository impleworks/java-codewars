package com.company.kata.kyu6;

/**
 * Playing on a chessboard
 * https://www.codewars.com/kata/55ab4f980f2d576c070000f4
 * 24-12-2020
 */

public class Suite2 {
    // The sum of the fractions of the square (n x n) is n^2 / 2
    public static String game(long n) {
        long num = n * n;
        long den = 2;
        if(num % den == 0) return "[" + (num / den) + "]";
        else return "[" + num + ", " + den + "]";
    }
}

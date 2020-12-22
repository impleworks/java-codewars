package com.company.kata.kyu7;

/**
 * Nth power rules them all!
 * https://www.codewars.com/kata/58aed2cafab8faca1d000e20
 * 22-12-2020
 */

public class NthPower {
    public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        for(int value: array){
            sum += Math.pow(value, power);
            sum -= value;
        }
        return sum;
    }
}

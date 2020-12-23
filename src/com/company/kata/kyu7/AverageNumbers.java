package com.company.kata.kyu7;

/**
 * Averages of numbers
 * https://www.codewars.com/kata/57d2807295497e652b000139
 * 23-12-2020
 */

public class AverageNumbers {
    public static double[] averages(int[] numbers) {
        if(numbers == null){
            return new double[]{};
        }
        if(numbers.length <= 1){
            return new double[]{};
        }
        double[] averages = new double[numbers.length - 1];
        for(int i = 0; i < numbers.length - 1; i++){
            averages[i] = 0.5 * (numbers[i] + numbers[i+1]);
        }
        return averages;
    }
}

package com.company.kata.kyu6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Playing with digits
 * https://www.codewars.com/kata/5552101f47fc5178b1000050
 * 23-12-2020
 */

public class DigPow {
    public static long digPow(int n, int p) {
        long powerSum = DigPow.getPowerSum(n, p);
        if(powerSum % n == 0){
            return powerSum / n;
        }
        return -1;
    }

    private static long getPowerSum(int n, int startPower) {
        long sum = 0;
        ArrayList<Integer> digits = DigPow.getDigits(n);
        int addPower = 0;
        for(int d : digits){
            sum += (long)Math.pow(d, startPower + addPower);
            addPower++;
        }
        return sum;
    }

    private static ArrayList<Integer> getDigits(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int number = n;
        int digit;
        while(number > 0) {
            digit = number % 10;

            number -= digit;
            number /= 10;

            result.add(digit);
        }
        Collections.reverse(result);
        return result;
    }
}
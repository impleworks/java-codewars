package com.company.kata.kyu6;

/**
 * Create Phone Number
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 * 23-12-2020
 */

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") "
                + numbers[3] + numbers[4] + numbers[5] + '-' +
                numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }
}

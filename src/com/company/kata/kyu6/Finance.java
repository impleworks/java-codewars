package com.company.kata.kyu6;

import java.math.BigInteger;

/**
 * Financing Plan on Planet XY140Z-n
 * https://www.codewars.com/kata/559ce00b70041bc7b600013d
 * 24-12-2020
 */

public class Finance {
    public static BigInteger finance(int n) {
        BigInteger totalSum = BigInteger.valueOf(0);
        for(int i = 0; i <= n; i++) {
            BigInteger weekSum = BigInteger.valueOf( (3L * i + n) * (n - i + 1L) / 2L );
            totalSum = totalSum.add(weekSum);
        }
        return totalSum;
    }
}

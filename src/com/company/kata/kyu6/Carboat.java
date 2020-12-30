package com.company.kata.kyu6;

/**
 * How Much?
 * https://www.codewars.com/kata/55b4d87a3766d9873a0000d4
 * 30-12-2020
 */

public class Carboat {
    public static String howmuch(int m, int n) {
        StringBuilder result = new StringBuilder("[");
        if(m > n) return Carboat.howmuch(n, m);
        for(int money = m; money <= n; money++)
        {
            if(money % 7 != 2) continue;
            if(money % 9 != 1) continue;

            int boatsCost = money - 2;
            int carsCost = money - 1;

            result.append(
                    String.format("[M: %d B: %d C: %d]",
                    money, boatsCost / 7, carsCost / 9)
            );
        }
        return result.append("]").toString();
    }
}
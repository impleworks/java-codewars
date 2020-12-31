package com.company.kata.kyu5;

import java.util.LinkedHashSet;

/**
 * Diophantine Equation
 * https://www.codewars.com/kata/554f76dca89983cc400000bb
 * 31-12-2020
 */

public class Dioph {
    public static String solEquaStr(long n) {
        LinkedHashSet<String> pairs = new LinkedHashSet<>();
        long max = (long)Math.floor(Math.sqrt(n)) + 1;
        long p, x, y;
        for(p = 1; p <= max; p += 1)
        {
            x = (p + n / p) / 2;
            y = (x - p) / 2;
            if( (x - 2 * y)*(x + 2 * y) != n ) continue;
            pairs.add(String.format("[%d, %d]", x, y));
        }
        return '[' + String.join(", ", pairs) + ']';
    }
}

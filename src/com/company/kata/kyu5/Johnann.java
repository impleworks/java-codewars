package com.company.kata.kyu5;

import java.util.ArrayList;
import java.util.List;

/**
 * John and Ann sign up for Codewars
 * https://www.codewars.com/kata/57591ef494aba64d14000526
 * 31-12-2020
 */

public class Johnann {

    private static List<Long> ann;
    private static List<Long> john;

    private static void generate(long n) {
        Johnann.ann = new ArrayList<>();
        Johnann.john = new ArrayList<>();
        for(int i = 0; i < (int)n; i++) {
            if(i == 0) {
                Johnann.john.add(0L);
                Johnann.ann.add(1L);
                continue;
            }

            Long newJohn = i - Johnann.ann.get(Math.toIntExact(Johnann.john.get(i - 1)));
            Johnann.john.add(newJohn);

            Long newAnn = i - Johnann.john.get(Math.toIntExact(Johnann.ann.get(i - 1)));
            Johnann.ann.add(newAnn);
        }
    }

    public static List<Long> john(long n) {
        Johnann.generate((int)n);
        return Johnann.john;
    }

    public static List<Long> ann(long n) {
        Johnann.generate((int)n);
        return Johnann.ann;
    }

    public static long sumAnn(long n) {
        Johnann.generate((int)n);
        return Johnann.ann.stream()
                .mapToLong(Long::longValue)
                .sum();
    }

    public static long sumJohn(long n) {
        Johnann.generate((int)n);
        return Johnann.john.stream()
                .mapToLong(Long::longValue)
                .sum();
    }
}

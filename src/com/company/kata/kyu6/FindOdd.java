package com.company.kata.kyu6;

import java.util.HashMap;
import java.util.Map;

/**
 * FindOdd
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 * 02-01-2021
 */

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> repeats = new HashMap<>();
        int oldCount, result = 0;
        for(int n : a) {
            oldCount = repeats.getOrDefault(n, 0);
            repeats.put(n, oldCount + 1);
        }
        for(int n : repeats.keySet()){
            if(repeats.get(n) % 2 == 1) {
                result = n;
                break;
            }
        }
        return result;
    }
}
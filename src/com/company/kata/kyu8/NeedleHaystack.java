package com.company.kata.kyu8;

/**
 * A Needle in the Haystack
 * https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
 * 24-12-2020
 */

public class NeedleHaystack {
    public static String findNeedle(Object[] haystack) {
        for(int i = 0; i < haystack.length; i++){
            if(haystack[i] == null) continue;
            if(haystack[i].equals("needle"))
                return "found the needle at position " + i;
        }
        return "";
    }
}

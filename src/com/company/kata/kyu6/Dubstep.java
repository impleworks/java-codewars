package com.company.kata.kyu6;

/**
 * Dubstep
 * https://www.codewars.com/kata/551dc350bf4e526099000ae5
 * 24-12-2020
 */

public class Dubstep {
    public static String SongDecoder(String song) {
        String result = song.replace("WUBWUB", " ").replace("WUB", " ");
        while(result.contains("  ")){
            result = result.replace("  ", " ");
        }
        return result.strip();
    }
}

package com.company.kata.kyu6;

/**
 * Simple Encryption #1 - Alternating Split
 * https://www.codewars.com/kata/57814d79a56c88e3e0000786
 * 24-12-2020
 */

public class AlternatingSplit {
    public static String encrypt(final String text, final int n) {
        if(text == null || n <= 0) return text;
        if(text.isEmpty()) return text;

        int maxNthCharPos = (text.length() - text.length() % 2) / 2 - 1;
        char[] resultChars = text.toCharArray();

        for(int i = 1; i <= n; i++){
            char[] currentChars = new char[text.length()];
            for(int j = 0; j < text.length(); j++){
                if(j % 2 == 1) currentChars[(j - 1) / 2] = resultChars[j];
                else currentChars[maxNthCharPos + (j / 2) + 1] = resultChars[j];
            }
            resultChars = currentChars;
        }
        return String.valueOf(resultChars);
    }

    public static String decrypt(final String encryptedText, final int n) {
        if(encryptedText == null || n <= 0) return encryptedText;
        if(encryptedText.isEmpty()) return encryptedText;

        int maxNthCharPos = (encryptedText.length() - encryptedText.length() % 2) / 2 - 1;
        char[] resultChars = encryptedText.toCharArray();

        for(int i = 1; i <= n; i++){
            char[] currentChars = new char[encryptedText.length()];
            for(int j = 0; j < encryptedText.length(); j++){
                if(j <= maxNthCharPos)
                    currentChars[2 * j + 1] = resultChars[j];
                else
                    currentChars[2 * (j - maxNthCharPos - 1)] = resultChars[j];
            }
            resultChars = currentChars;
        }
        return String.valueOf(resultChars);
    }
}

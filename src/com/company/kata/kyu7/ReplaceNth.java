package com.company.kata.kyu7;

/**
 * Replace every nth
 * https://www.codewars.com/kata/57fcaed83206fb15fd00027a
 * 24-12-2020
 */

public class ReplaceNth {
    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(char ch : text.toCharArray()){
            if(ch == oldValue){
                if(count == n){
                    sb.append(newValue);
                    count = 1;
                }
                else {
                    sb.append(ch);
                    count++;
                }
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}

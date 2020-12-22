package com.company.kata.kyu8;

/**
 * Will there be enough space?
 * https://www.codewars.com/kata/5875b200d520904a04000003
 * 22-12-2020
 */

public class Bob {
    public static int enough(int cap, int on, int wait){
        if(on + wait <= cap){
            return 0;
        }
        return wait - (cap - on);
    }
}

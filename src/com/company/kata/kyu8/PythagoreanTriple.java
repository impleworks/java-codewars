package com.company.kata.kyu8;

/**
 * Pythagorean Triple
 * https://www.codewars.com/kata/5951d30ce99cf2467e000013
 * 22-12-2020
 */

public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){
        int squareSum = (int)(Math.pow(triple[0], 2) + Math.pow(triple[1], 2));
        if(squareSum == Math.pow(triple[2], 2)){
            return 1;
        }
        return 0;
    }
}

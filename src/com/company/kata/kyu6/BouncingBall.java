package com.company.kata.kyu6;

/**
 * Bouncing Balls
 * https://www.codewars.com/kata/5544c7a5cb454edb3c000047
 * 01-01-2021
 */

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if(h <= 0) return -1;
        if(bounce <= 0 || bounce >= 1) return -1;
        if(window >= h) return -1;

        int count = 0;
        double from = h, to = 0.0, temp;
        while(window < Math.max(from, to))
        {
            count++;

            temp = from;
            from = to;
            to = temp * ((from >= to) ? bounce : 1);
        }
        return count;
    }
}
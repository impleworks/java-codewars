package com.company.kata.kyu8;

/**
 * Surface Area and Volume of a Box
 * https://www.codewars.com/kata/565f5825379664a26b00007c
 * 22-12-2020
 */

public class Box {
    public static int[] getSize(int w,int h,int d) {
        int area = 2 * (w * h + w * d + h * d);
        int volume = w * h * d;
        return new int[] {area, volume};
    }
}

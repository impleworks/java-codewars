package com.company.kata.kyu7;

/**
 * Red Knight
 * https://www.codewars.com/kata/5fc4349ddb878a0017838d0f
 * 23-12-2020
 */

public class RedKnight {
    public static PawnDistance redKnight(int knight, long pawn) {
        long moveCount = 2 + pawn;
        long knightX = 2 * moveCount - 4;
        long knightY = (moveCount % 2 == 0) ? knight : (1 - knight);

        String color = ((knightX + knightY) % 2 != 0) ? "Black" : "White";
        return new PawnDistance(color, knightX);
    }
}

// This class is preloaded
class PawnDistance {
    private String color;
    private long distance;
    
    public PawnDistance(String s, long d) {
        color = s;
        distance = d;
    }

    @Override
    public String toString() {
        return "PawnDistance{color=" + color + ", distance=" + distance + '}';
    }
}
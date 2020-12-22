package com.company.kata.kyu7;

import java.awt.geom.Point2D;

/**
 * Cartesian coordinates from degree angle
 * https://www.codewars.com/kata/555f43d8140a6df1dd00012b
 * 23-12-2020
 */

public class CoordinatesInspector {
    public Point2D coordinates(Double degrees, Double radius) {
        double x = radius * Math.cos(Math.toRadians(degrees));
        double y = radius * Math.sin(Math.toRadians(degrees));

        double roundedX = this.round(x, 10);
        double roundedY = this.round(y, 10);

        return new Point2D.Double(roundedX, roundedY);
    }

    private Double round(Double value, int places) {
        double roundDegree = Math.pow(10, places);
        return Math.round(value * roundDegree) / roundDegree;
    }
}



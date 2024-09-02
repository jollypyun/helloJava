package com.example.practicingjava.figureimpl;

import com.example.practicingjava.figure.Figure;

import static java.lang.Math.*;

public class Triangle implements Figure {
    private final double x1;
    private final double x2;
    private final double x3;
    private final double y1;
    private final double y2;
    private final double y3;

    public Triangle(Double[] doubles) {
        this.x1 = doubles[0];
        this.y1 = doubles[1];
        this.x2 = doubles[2];
        this.y2 = doubles[3];
        this.x3 = doubles[4];
        this.y3 = doubles[5];
    }

    @Override
    public double getArea() {
        double tmp = (x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3);
        return round(0.5 * tmp)/10.0;
    }

    @Override
    public double getPerimeter() {
        double tmp = getLengthOfTwoPoints(x1, x2, y1, y2) + getLengthOfTwoPoints(x2, x3, y2, y3) + getLengthOfTwoPoints(x3, x1, y3, y1);
        return round(tmp)/10.0;
    }

    private double getLengthOfTwoPoints(double p1, double p2, double q1, double q2) {
        return sqrt(pow(p1 - q1, 2)) + sqrt(pow(p2 - q2, 2));
    }
}

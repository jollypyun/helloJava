package com.example.practicingjava.figureimpl;

import com.example.practicingjava.figure.Figure;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class PolyLine implements Figure {
    private final Double[] points;

    public PolyLine(Double[] points) {
        this.points = points;
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        List<Double> xList = new ArrayList<>();
        List<Double> yList = new ArrayList<>();
        double ret = 0;

        for (int i=0; i < points.length; i++) {
            if (i % 2 == 0) {
                xList.add(points[i]);
            } else {
                yList.add(points[i]);
            }
        }

        for (int i=0; i < xList.size() - 1; i++) {
            ret += getLengthOfTwoPoints(xList.get(i), xList.get(i+1), yList.get(i), yList.get(i+1));
        }
        return round(ret)/10.0;
    }

    private double getLengthOfTwoPoints(double p1, double p2, double q1, double q2) {
        return sqrt(pow(p1 - q1, 2)) + sqrt(pow(p2 - q2, 2));
    }
}

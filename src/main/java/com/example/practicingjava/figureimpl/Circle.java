package com.example.practicingjava.figureimpl;

import com.example.practicingjava.figure.Figure;

import static java.lang.Math.*;

public class Circle implements Figure {
    private final double radius;

    public Circle(Double[] doubles) {
        this.radius = doubles[0];
    }

    @Override
    public double getArea() {
        return round(PI * pow(radius, 2))/10.0;
    }

    @Override
    public double getPerimeter() {
        return round(2 * PI * radius)/10.0;
    }
}

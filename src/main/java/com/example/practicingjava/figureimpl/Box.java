package com.example.practicingjava.figureimpl;

import com.example.practicingjava.figure.Figure;

import static java.lang.Math.round;

public class Box implements Figure {
    private final double x;
    private final double y;
    private final double width;
    private final double height;

    public Box(Double[] doubles) {
        this.x = doubles[0];
        this.y = doubles[1];
        this.width = doubles[2];
        this.height = doubles[3];
    }

    @Override
    public double getArea() {
        return round(2 * (width + height))/10.0;
    }

    @Override
    public double getPerimeter() {
        return round(width * height)/10.0;
    }
}

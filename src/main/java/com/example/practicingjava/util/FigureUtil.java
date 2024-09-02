package com.example.practicingjava.util;

import com.example.practicingjava.enums.*;
import com.example.practicingjava.figure.Figure;
import com.example.practicingjava.figureimpl.*;

import java.util.Arrays;

public class FigureUtil {
    public Figure checkFigure(String str) {
        String[] strList = str.split(" ");
        String shape = strList[0];
        String[] tempList = Arrays.copyOfRange(strList,1, strList.length);
        Double[] valueList = new Double[tempList.length];
        for(int i = 0; i < tempList.length; i++) {
            valueList[i] = Double.valueOf(tempList[i]);
        }

        return switch (Shape.of(shape)) {
            case BOX -> new Box(valueList);
            case CIRCLE -> new Circle(valueList);
            case POLYLINE -> new PolyLine(valueList);
            case TRIANGLE -> new Triangle(valueList);
        };
    }
}

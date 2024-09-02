package com.example.practicingjava.enums;

import java.util.Arrays;
import java.util.Objects;

public enum Shape {
    BOX("Box"), CIRCLE("Circle"), POLYLINE("PolyLine"), TRIANGLE("Triangle");

    private final String name;

    Shape(String name) {
        this.name = name;
    }

    public static Shape of(String name) {
        return Arrays.stream((values()))
                .filter(val -> Objects.equals(name, val.name))
                .findFirst()
                .orElse(null);
    }
}

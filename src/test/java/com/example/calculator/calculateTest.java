package com.example.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class calculateTest {
    private static Calculator calculator = new Calculator();
    @Test
    void cal() {
        List<Integer> myInts = List.of(1,2,3,4,5);
        List<Long> myLongs = List.of(1L,2L,3L,4L,5L);
        List<Double> myDoubles = List.of(1.0,2.0,3.0,4.0,5.0);
        List<Number> myNumber = new ArrayList<>();
        calculator.addNumber(myNumber);
        System.out.println("myNumber = " + myNumber);
        System.out.println(calculator.sum(myInts));
        System.out.println(calculator.sum(myLongs));
        System.out.println(calculator.sum(myDoubles));
    }
}

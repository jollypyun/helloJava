package com.example.practicingjava.input;

import com.example.practicingjava.figure.Figure;
import com.example.practicingjava.util.FigureUtil;

import java.util.Scanner;

public class FigureInput {
    public void inputFigure() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Figure figure = new FigureUtil().checkFigure(str);

        scanner.close();
    }
}

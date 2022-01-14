package com.codegym;

public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return "Tam giác đều";
        }
        return "Không phải tam giác đều";
    }
}

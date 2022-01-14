package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("tam giác đều")
    public void checkTriangle1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều";
        String actual = TriangleClassifier.checkTriangle(a, b, c);

        assertEquals(expected, actual);
    }
}
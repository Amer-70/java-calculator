package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
        Assertions.assertEquals(5, Calculator.add(2, 3));
        Assertions.assertEquals(0, Calculator.add(-2, 2));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(1, Calculator.subtract(3, 2));
        Assertions.assertEquals(-4, Calculator.subtract(-2, 2));
    }
}
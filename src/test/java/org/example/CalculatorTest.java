package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void multiply() {
        Assertions.assertEquals(8, Calculator.multiply(2, 4));
        Assertions.assertEquals(-4, Calculator.multiply(-2, 2));
    }

    @Test
    void divide() {
        Assertions.assertEquals(3, Calculator.divide(9, 3));
        Assertions.assertEquals(-1, Calculator.divide(-2, 2));

        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0));
    }
}
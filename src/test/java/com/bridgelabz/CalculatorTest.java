package com.bridgelabz;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoNumbers() {
        Assertions.assertEquals(10, calculator.add(5, 5));
        Assertions.assertEquals(-2, calculator.add(-1, -1));
        Assertions.assertEquals(0, calculator.add(5, -5));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        Assertions.assertEquals(3, calculator.subtract(5, 2));
        Assertions.assertEquals(-5, calculator.subtract(-3, 2));
        Assertions.assertEquals(0, calculator.subtract(7, 7));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        Assertions.assertEquals(15, calculator.multiply(3, 5));
        Assertions.assertEquals(-6, calculator.multiply(-2, 3));
        Assertions.assertEquals(0, calculator.multiply(0, 100));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        Assertions.assertEquals(2, calculator.divide(10, 5));
        Assertions.assertEquals(-3, calculator.divide(-9, 3));
        Assertions.assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        Assertions.assertThrows(ArithmeticException.class,()->calculator.divide(10, 0));
    }
}

package com.bridgelabz;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.*;
public class NumberUtilsTest {
    private final NumberUtils numberUtils = new NumberUtils();
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void shouldReturnTrueForEvenNumbers(int number) {
        Assertions.assertTrue(numberUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    public void shouldReturnFalseForOddNumbers(int number) {
        Assertions.assertFalse(numberUtils.isEven(number));
    }
}

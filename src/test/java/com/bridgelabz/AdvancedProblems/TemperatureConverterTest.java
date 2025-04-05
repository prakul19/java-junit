package com.bridgelabz.AdvancedProblems;
import org.junit.jupiter.api.*;
public class TemperatureConverterTest {
    private TemperatureConverter converter;
    @BeforeEach
    void setup() {
        converter = new TemperatureConverter();
    }
    @Test
    public void shouldConvertCelsiusToFahrenheitCorrectly() {
        Assertions.assertEquals(32.0, converter.celsiusToFahrenheit(0));
        Assertions.assertEquals(212.0, converter.celsiusToFahrenheit(100));
    }
    @Test
    public void shouldConvertFahrenheitToCelsiusCorrectly() {
        Assertions.assertEquals(0.0, converter.fahrenheitToCelsius(32));
        Assertions.assertEquals(100.0, converter.fahrenheitToCelsius(212));
    }
}


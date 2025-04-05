package com.bridgelabz.AdvancedProblems;
import org.junit.jupiter.api.*;
public class DateFormatterTest {
    private DateFormatter dateFormatter;
    @BeforeEach
    void setup() {
        dateFormatter = new DateFormatter();
    }
    @Test
    public void shouldFormatValidDateCorrectly() {
        Assertions.assertEquals("15-04-2024", dateFormatter.formatDate("2024-04-15"));
        Assertions.assertEquals("01-01-2000", dateFormatter.formatDate("2000-01-01"));
    }
    @Test
    public void shouldReturnNullForInvalidDate() {
        Assertions.assertNull(dateFormatter.formatDate("15-04-2024"));
        Assertions.assertNull(dateFormatter.formatDate("2024/04/15"));
        Assertions.assertNull(dateFormatter.formatDate("invalid"));
        Assertions.assertNull(dateFormatter.formatDate(""));
    }
}

